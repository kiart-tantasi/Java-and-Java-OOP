const express = require("express");
const app = express();
const port = 8080;

app.get("/", (req, res) => {
  res.send("Hello, world!\nThis is MOCK API !");
  console.log(`${req.url}, ${req.body}`);
});

app.listen(port, () => {
  console.log(`Mock API server listening at http://localhost:${port}`);
});
