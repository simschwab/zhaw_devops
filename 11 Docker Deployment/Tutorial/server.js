'use strict';

const express = require('express');

// Constants
const PORT = 8080;
const HOST = '0.0.0.0';

// App
const app = express(); 
app.get('/', (req, res) => {
    res.send('DevOps Course FS 2022, created by Simon :) and this is a change to test automated jenkins build'); 
});

app.listen(PORT, HOST); 
console.log(`Running on http://${HOST}:${PORT}`);