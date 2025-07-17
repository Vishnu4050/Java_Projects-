const apiUrl = "http://localhost:8085/api/product";

document.getElementById("add-form").addEventListener("submit", async (e) => {
  e.preventDefault();

  const id = document.getElementById("id").value;
  const pname = document.getElementById("pname").value;
  const price = document.getElementById("price").value;

  const student = { id, pname, price };

  const messageDiv = document.getElementById("message");

  try {
    const res = await fetch(apiUrl, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(student),
    });

    if (res.ok) {
      messageDiv.style.color = "green";
      messageDiv.textContent = "✅ Added Successfully!";
      e.target.reset();
    } else {
      messageDiv.style.color = "red";
      messageDiv.textContent = "❌ Failed to Add.";
    }
  } catch (err) {
    messageDiv.style.color = "red";
    messageDiv.textContent = "❌ Error: Could not connect to server.";
  }
});
