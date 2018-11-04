TYPE=VIEW
query=select sql_no_cache `homework`.`attendtable`.`staffCode` AS `staffCode`,`homework`.`attendtable`.`date` AS `date`,`homework`.`attendtable`.`attendInHoliday` AS `attendInHoliday`,`homework`.`attendtable`.`absenceDay` AS `absenceDay` from `homework`.`attendtable` where (length(`homework`.`attendtable`.`date`) = 4)
md5=83ac5053bd65b74ee8330dd5a556ad7f
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=2
revision=1
timestamp=2018-04-28 17:50:17
create-version=1
source=select `attendtable`.`staffCode` AS `staffCode`,`attendtable`.`date` AS `date`,`attendtable`.`attendInHoliday` AS `attendInHoliday`,`attendtable`.`absenceDay` AS `absenceDay` from `attendtable` where (length(`attendtable`.`date`) = 4)  WITH CASCADED CHECK OPTION
