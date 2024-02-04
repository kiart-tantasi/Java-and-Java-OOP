const express = require("express");
const app = express();
const port = 3000;

app.get("/", (req, res) => {
  res.send("Hello, world!");
  console.log(`${req.url}, ${req.body}`);
});

app.listen(port, () => {
  console.log(`Mock API server listening at http://localhost:${port}`);
});
