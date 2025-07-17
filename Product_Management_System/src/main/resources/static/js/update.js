const apiUrl = "http://localhost:8085/api/product";

async function updateStudent() {
	const id = document.getElementById("id").value;
	const pname = document.getElementById("pname").value;
	const price = document.getElementById("price").value;

	const student = { id, pname, price };

	const res = await fetch(`${apiUrl}/${id}`, {
		method: "PUT",
		headers: { "Content-Type": "application/json" },
		body: JSON.stringify(student),
	});

	const messageElement = document.getElementById("message");

	if (res.ok) {
		messageElement.textContent = "Updated Successfully...";
		messageElement.style.color = "green";
	} else {
		messageElement.textContent = "Not Updated...";
		messageElement.style.color = "red";
	}
}
