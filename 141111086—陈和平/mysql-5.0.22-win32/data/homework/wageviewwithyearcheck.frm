TYPE=VIEW
query=select sql_no_cache `homework`.`wagetable`.`staffCode` AS `staffCode`,`homework`.`wagetable`.`date` AS `date`,`homework`.`wagetable`.`basicWages` AS `basicWages`,`homework`.`wagetable`.`allowances` AS `allowances`,`homework`.`wagetable`.`idealWages` AS `idealWages`,`homework`.`wagetable`.`debits` AS `debits`,`homework`.`wagetable`.`actualWages` AS `actualWages` from `homework`.`wagetable` where (length(`homework`.`wagetable`.`date`) = 4)
md5=b3a838440f6cc4a6ed51e3793c0c0ea9
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=2
revision=1
timestamp=2018-04-28 17:50:17
create-version=1
source=select `wagetable`.`staffCode` AS `staffCode`,`wagetable`.`date` AS `date`,`wagetable`.`basicWages` AS `basicWages`,`wagetable`.`allowances` AS `allowances`,`wagetable`.`idealWages` AS `idealWages`,`wagetable`.`debits` AS `debits`,`wagetable`.`actualWages` AS `actualWages` from `wagetable` where (length(`wagetable`.`date`) = 4)  WITH CASCADED CHECK OPTION
