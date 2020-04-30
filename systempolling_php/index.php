<?php 
	include 'conn.php';
	$query = mysqli_query($conn, "SELECT * FROM framework");

	if(isset($_POST['submit'])) {
		$id = $_POST['id'];
		mysqli_query($conn, "UPDATE framework SET value=value+1 WHERE id = '$id' ");
		header('location:index.php?'.$id);
	}
 ?>

 <!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title> Votting Framework CSS Terbaik </title>
	<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2 class="text-center">Voting Framework CSS Terbaik</h2>
				<hr>
				<div class="row">
					
					<div class="col-6">
						<p class="lead">Pilih CSS Framework yang menurut anda paling menarik</p>
						<hr>
						<form action="" method="post">
							<div>
						
								<?php foreach($query as $row) { ?>
									<div class="form-group">
										<input name="id" type="radio" aria-valuenow="" class="pollradio" value="<?php echo $row['id'] ?>">
										<?php echo $row['framework'] ?>
									</div>
								<?php } ?>	
							</div>
							<br>
							<button type="submit" name="submit" class="btn btn-primary" id="btn">submit</button>
						</form>

					</div>
					<div class="col-6">
						<p class="lead">Live Polling Framework CSS</p>
						<hr>

						<div class="row mb-3">
							<?php foreach($query as $row) { ?>
								<div class="col-3 mb-3">
										<div><?php echo $row['framework'] ?></div>
								</div>
								<div class="col-8">
									<div class="progress mt-1">
									  <div class="progress-bar <?php 
									  if ($row['value']>50 && $row['value']<100) echo 'bg-success';
									  else if($row['value'] >= 100) echo "bg-primary";
									  else if($row['value'] < 50) echo "bg-danger";

									  ?>" role="progressbar" style="width: <?php echo $row['value'] ?>%;" aria-valuenow="<?php echo $row['value'] ?>" aria-valuemin="0" aria-valuemax="100"><?php echo $row['value'] ?>% <?php echo $row['value'] >= 100 ? 'Completed' : 'Uncompleted' ?></div>
									</div>		
								</div>
							<?php } ?>
							
					</div>
				</div>
			</div>
		</div>
	</div>
	
				
</body>
</html>
