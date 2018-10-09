<?php 
$servername = "healthcareltd-mysqldbserver.mysql.database.azure.com";
$username = "mysqldbuser@healthcareltd-mysqldbserver";
$password = "sepUTSspring2018*";

$connect = new PDO("mysql:host=$servername;dbname=mysqldatabase39150",$username,$password);


$data = array();

$query = "select * from appointment";

$statement = $connect ->prepare($query);

$statement ->execute();

$result = $statement -> fetchALL();

foreach($result as $row)
{
	$data[] =array(
			
			'id' => $row["Appointmentid"],
			'title' => $row["Appointmenttitle"],
			'start' => $row["Appointmentstartday"],
			'start' => $row["Appointmentstarttime"],
			'end' => $row["Appointmentendtime"],
			
			
	);
	
}

echo json_encode($data);



?>