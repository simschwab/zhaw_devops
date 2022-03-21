package Spark.Java;
import com.google.gson.Gson;
import spark.Spark;

public class SparkRestExample {
   
    

    public static void main(String[] args) {
       
       // UserService userService = new UserService() {
            
        Spark.post("/users", (request, response) -> {
            response.type("application/json");
            User user = new Gson().fromJson(request.body(), User.class);
            userService.addUser(user);
        
            return new Gson()
              .toJson(new StandardResponse(StatusResponse.SUCCESS));
         });
        
        
         Spark.get("/users", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(
              new StandardResponse(StatusResponse.SUCCESS,new Gson()
                .toJsonTree(userService.getUsers())));
        });
        Spark.get("/users/:id", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(
              new StandardResponse(StatusResponse.SUCCESS,new Gson()
                .toJsonTree(userService.getUser(request.params(":id")))));
        });
        Spark.put("/users/:id", (request, response) -> {
            response.type("application/json");
            User toEdit = new Gson().fromJson(request.body(), User.class);
            User editedUser = userService.editUser(toEdit);
                    
            if (editedUser != null) {
                return new Gson().toJson(
                  new StandardResponse(StatusResponse.SUCCESS,new Gson()
                    .toJsonTree(editedUser)));
            } else {
                return new Gson().toJson(
                  new StandardResponse(StatusResponse.ERROR,new Gson()
                    .toJson("User not found or error in edit")));
            }
        });
        Spark.delete("/users/:id", (request, response) -> {
            response.type("application/json");
            userService.deleteUser(request.params(":id"));
            return new Gson().toJson(
              new StandardResponse(StatusResponse.SUCCESS, "user deleted"));
        });
        
        Spark.options("/users/:id", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(
              new StandardResponse(StatusResponse.SUCCESS, 
                (userService.userExist(
                  request.params(":id"))) ? "User exists" : "User does not exists" ));
        });
    }

    
}
