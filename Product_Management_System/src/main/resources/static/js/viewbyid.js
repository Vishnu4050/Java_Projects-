const apiUrl = "http://localhost:8085/api/product";

async function findStudent() {
  const id = document.getElementById('search-id').value.trim();
  const resultContainer = document.getElementById('result');
  resultContainer.innerHTML = ''; // clear

  if (!id) {
    resultContainer.textContent = 'Please enter a valid product ID.';
    return;
  }

  try {
    const response = await fetch(`${apiUrl}/${id}`);
    if (!response.ok) {
      // 404 or other errors => handled
      throw new Error(`Status: ${response.status}`);
    }

    const product = await response.json();
    console.log('Fetched product:', product);

    const card = document.createElement('div');
    card.className = 'result-card';
    card.innerHTML = `
      <h2>${product.pname} (ID: ${product.id})</h2>
      <p><strong>Price:</strong> ${product.price}</p>
      <p><strong>Manufactured date:</strong> ${product.mdate}</p>
      <p><strong>Last Updated date:</strong> ${product.udate}</p>
    `;
    resultContainer.appendChild(card);

  } catch (err) {
    console.error(err);

    // Show error card
    const errCard = document.createElement('div');
    errCard.className = 'result-card';
    errCard.innerHTML = `
      <h2>Product Not Found</h2>
      <p>Please check the ID and try again.</p>
    `;
    resultContainer.appendChild(errCard);
  }
} 