let taskFormEl=document.getElementById("task-form");

taskFormEl.addEventListener('submit',function(event)
{
	event.preventDefault();
	let taskEl=document.getElementById('task-el');
	let task=taskEl.value.trim();
	

	let taskList=localStorage.getItem('tasks')?JSON.parse(localStorage.getItem('tasks')):[];

	taskList.unshift(task);
	localStorage.setItem('tasks',JSON.stringify(taskList));
	displayTasks();

});


//display tasks

function displayTasks()
{
	let displayListEl=document.getElementById('display-list');

	let taskList=localStorage.getItem('tasks')?JSON.parse(localStorage.getItem('tasks')):[];

	let eachTask=``;
	for(let task of taskList)
	{
		eachTask+=`<li class="list-group-item list-group-item-primary">
						<span>${task}</span>
						<button class="btn-close float-end">
							<i class="fa fa-times-circle"></i>
						</button>
					</li>`
	}
	displayListEl.innerHTML=eachTask;
}
displayTasks();


let displayListEl=document.getElementById('display-list');

displayListEl.addEventListener('click',function(event)
{
	let targetEl=event.target;

	if(targetEl.classList.contains('fa-times-circle'))
	{
		let actualEle=targetEl.parentElement.parentElement;
		let selectedText=actualEle.innerText;


		let taskList=localStorage.getItem('tasks')?JSON.parse(localStorage.getItem('tasks')):[];

		taskList=taskList.filter((task)=>
		{
			return task.trim()!==selectedText.trim();
		})
		localStorage.setItem('tasks',JSON.stringify(taskList));

		displayTasks();
	}
})