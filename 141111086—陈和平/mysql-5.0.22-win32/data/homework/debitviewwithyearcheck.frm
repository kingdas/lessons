TYPE=VIEW
query=select sql_no_cache `homework`.`debittable`.`staffCode` AS `staffCode`,`homework`.`debittable`.`date` AS `date`,`homework`.`debittable`.`absenceDebit` AS `absenceDebit`,`homework`.`debittable`.`insurance` AS `insurance`,`homework`.`debittable`.`taxation` AS `taxation` from `homework`.`debittable` where (length(`homework`.`debittable`.`date`) = 4)
md5=2d7353b7571653eea9b497101e04060e
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=2
revision=1
timestamp=2018-04-28 17:50:17
create-version=1
source=select `debittable`.`staffCode` AS `staffCode`,`debittable`.`date` AS `date`,`debittable`.`absenceDebit` AS `absenceDebit`,`debittable`.`insurance` AS `insurance`,`debittable`.`taxation` AS `taxation` from `debittable` where (length(`debittable`.`date`) = 4)  WITH CASCADED CHECK OPTION
