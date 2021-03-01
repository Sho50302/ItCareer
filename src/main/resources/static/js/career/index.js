'use strict';

{
	const mydata = {
      labels: ["Java", "Ruby", "PHP", "Python", "JS", "SQL", "C", "C++", "C#"],
      datasets: [{
	    label: '経験言語（月数）',
        data: [18, 6, 3, 0, 6, 12, 3, 3, 3],
        /*backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)',
                'rgba(255, 159, 64, 0.2)'
            ],
            borderColor: [
                'rgba(255,99,132,1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],*/
            borderWidth: 1
      }]
   }
    
    const graph = document.getElementById("graph").getContext('2d');
	const userBarChart = new Chart(graph, {
      type: 'bar',
      data: mydata
    });
	
}