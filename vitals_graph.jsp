<canvas id="myChart"></canvas>

<script>
    var ctx = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'line',
        data: JSON.parse('<%= request.getAttribute("chartData") %>'),
        options: {
            // Chart.js options here
        }
    });
</script>
