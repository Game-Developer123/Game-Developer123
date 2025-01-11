<!DOCTYPE html>
<html>
<head>
    <title>Vitals Graph</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <h1>Vitals Graph</h1>
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
</body>
</html>
