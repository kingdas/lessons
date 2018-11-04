TYPE=VIEW
query=select sql_no_cache `homework`.`allowancetable`.`staffCode` AS `staffCode`,`homework`.`allowancetable`.`date` AS `date`,`homework`.`allowancetable`.`fullAttendReward` AS `fullAttendReward`,`homework`.`allowancetable`.`overtimePays` AS `overtimePays`,`homework`.`allowancetable`.`annualBonus` AS `annualBonus` from `homework`.`allowancetable` where (length(`homework`.`allowancetable`.`date`) = 4)
md5=80bc95577ef4fa25eeb7f68654ffe1db
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=2
revision=1
timestamp=2018-04-28 17:50:17
create-version=1
source=select `allowancetable`.`staffCode` AS `staffCode`,`allowancetable`.`date` AS `date`,`allowancetable`.`fullAttendReward` AS `fullAttendReward`,`allowancetable`.`overtimePays` AS `overtimePays`,`allowancetable`.`annualBonus` AS `annualBonus` from `allowancetable` where (length(`allowancetable`.`date`) = 4)  WITH CASCADED CHECK OPTION
