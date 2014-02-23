<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<script type="text/javascript"
	src="https://www.google.com/jsapi?autoload={'modules':[{'name':'visualization',
       'version':'1','packages':['timeline']}]}"></script>
<script type="text/javascript">
	google.setOnLoadCallback(drawChart);
	function drawChart() {

		var container = document.getElementById('example3.1');
		var chart = new google.visualization.Timeline(container);

		var dataTable = new google.visualization.DataTable();
		dataTable.addColumn({
			type : 'string',
			id : 'Position'
		});
		dataTable.addColumn({
			type : 'string',
			id : 'Name'
		});
		dataTable.addColumn({
			type : 'date',
			id : 'Start'
		});
		dataTable.addColumn({
			type : 'date',
			id : 'End'
		});
		dataTable.addRows([
				[ 'President', 'George Washington', new Date(1789, 3, 29),
						new Date(1797, 2, 3) ],
				[ 'President', 'John Adams', new Date(1797, 2, 3),
						new Date(1801, 2, 3) ],
				[ 'President', 'Thomas Jefferson', new Date(1801, 2, 3),
						new Date(1809, 2, 3) ],
				[ 'Vice President', 'John Adams', new Date(1789, 3, 20),
						new Date(1797, 2, 3) ],
				[ 'Vice President', 'Thomas Jefferson', new Date(1797, 2, 3),
						new Date(1801, 2, 3) ],
				[ 'Vice President', 'Aaron Burr', new Date(1801, 2, 3),
						new Date(1805, 2, 3) ],
				[ 'Vice President', 'George Clinton', new Date(1805, 2, 3),
						new Date(1812, 3, 19) ],
				[ 'Secretary of State', 'John Jay', new Date(1789, 8, 25),
						new Date(1790, 2, 21) ],
				[ 'Secretary of State', 'Thomas Jefferson',
						new Date(1790, 2, 21), new Date(1793, 11, 30) ],
				[ 'Secretary of State', 'Edmund Randolph',
						new Date(1794, 0, 1), new Date(1795, 7, 19) ],
				[ 'Secretary of State', 'Timothy Pickering',
						new Date(1795, 7, 19), new Date(1800, 4, 11) ],
				[ 'Secretary of State', 'Charles Lee', new Date(1800, 4, 12),
						new Date(1800, 5, 4) ],
				[ 'Secretary of State', 'John Marshall', new Date(1800, 5, 12),
						new Date(1801, 2, 3) ],
				[ 'Secretary of State', 'Levi Lincoln', new Date(1801, 2, 4),
						new Date(1801, 4, 0) ],
				[ 'Secretary of State', 'James Madison', new Date(1801, 4, 1),
						new Date(1809, 2, 2) ] ]);

		chart.draw(dataTable);
	}
</script>

<body>
	<div id="example3.1" style="width: 1000px; height: 200px;"></div>
</body>
</html>