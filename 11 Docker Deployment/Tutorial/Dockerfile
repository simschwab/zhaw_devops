FROM node:14

# Create app directory
WORKDIR /usr/src/app

# Copy app
COPY . .

# Install
RUN npm install
 
# Docker Run Command
EXPOSE 8080
CMD [ "node", "server.js" ]