<?php
$nums = array(5, 3, 1, 4, 2);

for($i=0, $size = count($nums); $i < $size -1; $i++)
    for($j =0; $j < $size -$i -1; $j++)
        if($nums[$j] > $nums[$j+1]){
            $temp = $nums[$j];
            $nums[$j] = $nums[$j+1];
            $nums[$j+1] = $temp;
        }
echo '<pre>';
print_r($nums);

?>