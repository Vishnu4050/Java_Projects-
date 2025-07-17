/*const apiUrl="http://localhost:8085/api/student";

async function loadStudents(){
	const res=await fetch(apiUrl);
	const students=await res.json();
	
	const list=document.getElementById("student-list");
	list.innerHTML="";
	
	students.forEach(s=>{
		const li=document.createElement("li");
		li.textContent=`${s.id}:${s.name} - ${s.email} - ${s.department}`;
		list.appendChild(li);
	});
}
loadStudents();*/


const apiUrl = "http://localhost:8085/api/product";

async function loadStudents() {
    const res = await fetch(apiUrl);
    const students = await res.json();

    const list = document.getElementById("student-list");
    list.innerHTML = "";

    students.forEach(s => {
        const div = document.createElement("div");
        div.className = "student-card";
        div.innerHTML = `
            <h3>${s.pname}</h3>
            <p><strong>ID:</strong> ${s.id}</p>
            <p><strong>price:</strong> ${s.price}</p>
            <p><strong>Manufactured Date:</strong> ${s.mdate}</p>
			<p><strong>Updated Date:</strong> ${s.udate}</p>
        `;
        list.appendChild(div);
    });
}

loadStudents();
