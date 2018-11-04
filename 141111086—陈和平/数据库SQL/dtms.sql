/*
Navicat MySQL Data Transfer

Source Server         : mysql-ceshi
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : dtms

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2018-05-28 21:20:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(20) NOT NULL auto_increment,
  `a_username` varchar(255) NOT NULL,
  `a_name` varchar(50) default NULL,
  `a_password` varchar(255) NOT NULL,
  `a_lasttime` datetime default NULL,
  PRIMARY KEY  (`admin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'hy', '侯永', '123123', '2018-03-20 11:03:56');
INSERT INTO `admin` VALUES ('2', 'lxz', '梁校长', '115114118', '2017-06-25 18:34:41');
INSERT INTO `admin` VALUES ('111113', 'admin', null, 'admin', null);

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `exam_id` int(11) NOT NULL auto_increment,
  `student_id` int(20) NOT NULL,
  `e_score` varchar(3) default NULL,
  `e_time` timestamp NULL default NULL,
  `e_truenum` varchar(2) default NULL,
  `e_falsenum` varchar(2) default NULL,
  PRIMARY KEY  (`exam_id`),
  KEY `student_id` (`student_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('180321002', '33', '60%', '2018-05-09 18:26:32', '3', '2');
INSERT INTO `exam` VALUES ('180321003', '33', '67%', '2018-05-09 18:28:56', '2', '1');
INSERT INTO `exam` VALUES ('180321004', '33', '80%', '2018-05-09 18:30:54', '4', '1');
INSERT INTO `exam` VALUES ('180321005', '33', '25%', '2018-05-09 18:49:25', '1', '3');
INSERT INTO `exam` VALUES ('180321006', '11', '0%', '2018-05-15 12:48:04', '0', '2');
INSERT INTO `exam` VALUES ('180321007', '11', '0%', '2018-05-15 12:48:30', '0', '1');
INSERT INTO `exam` VALUES ('180321008', '11', '70%', '2018-05-15 12:49:57', '7', '3');

-- ----------------------------
-- Table structure for learnrecord
-- ----------------------------
DROP TABLE IF EXISTS `learnrecord`;
CREATE TABLE `learnrecord` (
  `learnrecord_id` int(11) NOT NULL auto_increment,
  `student_id` int(20) NOT NULL,
  `start_time` timestamp NULL default NULL,
  `time` varchar(10) default NULL,
  `subject` varchar(3) default NULL,
  `l_juli` varchar(10) default NULL,
  `car_number` varchar(10) default NULL,
  PRIMARY KEY  (`learnrecord_id`),
  KEY `student_id` (`student_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of learnrecord
-- ----------------------------
INSERT INTO `learnrecord` VALUES ('183211', '11', '2018-03-06 11:32:01', '50', '科目三', '26', '豫N04566学');
INSERT INTO `learnrecord` VALUES ('117', '11', '2018-03-27 11:44:56', '18', '科目二', '28', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('116', '11', '2018-03-27 11:44:56', '18', '科目二', '10', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183212', '33', '2018-03-07 11:25:20', '21', '科目二', '25', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183213', '33', '2018-03-07 11:25:20', '21', '科目二', '25', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183214', '33', '2018-03-07 11:25:20', '21', '科目二', '25', '豫N04566学');
INSERT INTO `learnrecord` VALUES ('183215', '33', '2018-03-07 11:25:20', '21', '科目二', '25', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183216', '32', '2018-05-02 18:16:55', '66', '科目三', '55', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183217', '32', '2018-05-02 18:16:55', '66', '科目三', '55', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183218', '32', '2018-05-02 20:12:37', '66', '科目三', '55', '豫N00052学');
INSERT INTO `learnrecord` VALUES ('183219', '33', '2018-05-02 21:23:22', '66', '科目三', '55', '豫N04566学');

-- ----------------------------
-- Table structure for practice
-- ----------------------------
DROP TABLE IF EXISTS `practice`;
CREATE TABLE `practice` (
  `practice_id` int(11) NOT NULL auto_increment,
  `student_id` int(20) NOT NULL,
  `p_time` timestamp NULL default NULL,
  `p_score` varchar(4) default NULL,
  `p_truenum` varchar(3) default NULL,
  `p_falsenum` varchar(3) default NULL,
  `p_number` varchar(4) default NULL,
  PRIMARY KEY  (`practice_id`),
  KEY `student_id` (`student_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of practice
-- ----------------------------
INSERT INTO `practice` VALUES ('1803210001', '11', '2018-03-07 11:32:42', '91', '11', '22', '33');
INSERT INTO `practice` VALUES ('111', '2222', '2018-05-08 12:36:24', '33', '22', '44', '55');
INSERT INTO `practice` VALUES ('1803210002', '1111', '2018-05-08 13:38:58', '0%', '0', '2', '2');
INSERT INTO `practice` VALUES ('1803210003', '1111', '2018-05-08 16:26:07', '75%', '3', '1', '4');
INSERT INTO `practice` VALUES ('11111111', '1111', '2008-02-02 15:55:59', '99%', '11', '11', '22');
INSERT INTO `practice` VALUES ('1803210004', '1111', '2018-05-08 18:21:07', '34%', '2', '4', '6');
INSERT INTO `practice` VALUES ('1803210005', '1111', '2018-05-08 18:30:34', '0%', '0', '1', '1');
INSERT INTO `practice` VALUES ('1803210006', '1111', '2018-05-08 18:31:08', '0%', '0', '1', '1');
INSERT INTO `practice` VALUES ('1803210007', '33', '2018-05-09 12:26:37', '70%', '14', '6', '20');
INSERT INTO `practice` VALUES ('1803210008', '33', '2018-05-09 17:48:25', '74%', '14', '5', '19');
INSERT INTO `practice` VALUES ('1803210009', '33', '2018-05-09 17:49:40', '95%', '38', '2', '40');
INSERT INTO `practice` VALUES ('1803210010', '33', '2018-05-09 17:49:51', '82%', '53', '12', '65');
INSERT INTO `practice` VALUES ('1803210011', '33', '2018-05-09 17:51:48', '100%', '5', '0', '5');
INSERT INTO `practice` VALUES ('1803210012', '33', '2018-05-09 19:48:48', '95%', '18', '1', '19');
INSERT INTO `practice` VALUES ('1803210013', '33', '2018-05-10 00:31:41', '100%', '3', '0', '3');
INSERT INTO `practice` VALUES ('1803210014', '33', '2018-05-13 22:48:24', '50%', '2', '2', '4');
INSERT INTO `practice` VALUES ('1803210015', '11', '2018-05-20 16:36:52', '50%', '1', '1', '2');
INSERT INTO `practice` VALUES ('1803210016', '11', '2018-05-21 13:56:21', '50%', '1', '1', '2');

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `question_id` int(11) NOT NULL auto_increment,
  `q_name` varchar(255) NOT NULL,
  `q_item` varchar(255) NOT NULL,
  `answer_A` varchar(255) default NULL,
  `answer_B` varchar(255) default NULL,
  `answer_C` varchar(255) default NULL,
  `answer_D` varchar(255) default NULL,
  `right_key` varchar(8) NOT NULL,
  `subjectparse` varchar(255) default NULL,
  PRIMARY KEY  (`question_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('1001', '在狭窄的山路会车，规定不靠山体的一方优先行驶的原因是什么？', '选择题', 'A、不靠山体的一方车速较快', 'B、三项都正确', 'C、靠山体的一方视野宽阔', 'D、靠山体的一方相对安全', 'd', '不靠山体的一方是悬崖，更危险，所以先行。反过来靠山体的一方是相对安全的。');
INSERT INTO `question` VALUES ('1002', '牵引故障车，牵引与被牵引的机动车，在行驶中都要开启危险报警闪光灯。', '判断题', 'A、正确', '\r\n\r\n\r\nB、错误\r\n', '', '', 'a', '《实施条例》第六十一条：\r\n牵引车和被牵引车均应当开启危险报警闪光灯。');
INSERT INTO `question` VALUES ('1003', '雾天行车为了提高能见度，应该开启远光灯。', '判断题', 'A、正确', 'B、错误\r\n', '', '', 'b', '在行驶中应该打开雾灯、尾灯、示廓灯和前照灯(近光)，不能使用远光灯。因远光灯光轴偏上，射出的光线被雾气漫反射，在车前形成白茫茫一片，如同隔着磨砂玻璃一样，反而什么都看不见。雾天行车可以靠路面车道标线以及前车的红色尾灯来行车。');
INSERT INTO `question` VALUES ('1004', '公安机关交通管理部门对驾驶人的交通违法行为除依法给予行政处罚外，实行下列哪种制度？', '选择题', 'A、强制报废制度', 'B、累积记分制度', 'C、违法登记制度', 'D、奖励里程制度\r\n', 'b', '《道路交通安全法》第二十四条：\r\n公安机关交通管理部门对机动车驾驶人违反道路交通安全法律、法规的行为，除依法给予行政处罚外，实行累积记分制度。');
INSERT INTO `question` VALUES ('1005', '道路交通安全违法行为累积记分的周期是多长时间？', '选择题', 'A、3个月', 'B、24个月', 'C、12个月', 'D、6个月\r\n', 'c', '《公安部令第123号》第五十五条：\r\n道路交通安全违法行为累积记分周期（即记分周期）为12个月，满分为12分，从机动车驾驶证初次领取之日起计算。');
INSERT INTO `question` VALUES ('1006', '公安机关交通管理部门对累积记分达到规定分值的驾驶人怎样处理？', '选择题', 'A、终生禁驾', 'B、处15日以下拘留', 'C、进行法律法规教育，重新考试', 'D、依法追究刑事责任\r\n', 'c', '《道路交通安全法》第二十四条：\r\n公安机关交通管理部门对累积记分达到规定分值的机动车驾驶人，扣留机动车驾驶证，对其进行道路交通安全法律、法规教育，重新考试。');
INSERT INTO `question` VALUES ('1007', '驾驶人出现下列哪种情况，不得驾驶机动车？', '选择题', 'A、记分达到10分', 'B、驾驶证丢失、损毁', 'C、记分达到6分', 'D、驾驶证接近有效期\r\n', 'b', '驾驶证丢失、损毁的应当向机动车驾驶证核发地车辆管理所申请补发、换证，在此期间不得驾驶机动车。');
INSERT INTO `question` VALUES ('1008', '驾驶人在驾驶证丢失后3个月内还可以驾驶机动车。', '判断题', 'A、正确', 'B、错误\r\n', null, null, 'b', '机动车驾驶证遗失的，机动车驾驶人应当向机动车驾驶证核发地车辆管理所申请补发。在此期间，不符合“随身携带机动车驾驶证”的规定，故不得驾驶机动车。');
INSERT INTO `question` VALUES ('1009', '驾驶人持超过有效期的驾驶证可以在1年内驾驶机动车。', '判断题', 'A、正确', 'B、错误\r\n', null, null, 'b', '《实施条例》第二十八条：\r\n机动车驾驶人在机动车驾驶证丢失、损毁、超过有效期或者被依法扣留、暂扣期间以及记分达到12分的，不得驾驶机动车。');
INSERT INTO `question` VALUES ('1010', '驾驶人的驾驶证损毁后不得驾驶机动车。', '判断题', 'A、正确', 'B、错误\r\n', null, null, 'a', '《道路交通安全法实施条例》第二十八条：\r\n机动车驾驶人在机动车驾驶证丢失、损毁、超过有效期或者被依法扣留、暂扣期间以及记分达到12分的，不得驾驶机动车。');
INSERT INTO `question` VALUES ('1011', '驾驶机动车在车道减少的路口，遇到前方车辆依次停车或缓慢行驶时怎么办？', '选择题', 'A、从前车右侧路肩进入路口', 'B、每车道一辆依次交替驶入路口', 'C、从有空隙一侧进入路口', 'D、向左变道穿插进入路口\r\n', 'b', '《实施条例》第五十三条第三款：\r\n机动车在车道减少的路口、路段，遇有前方机动车停车排队等候或者缓慢行驶的，应当每车道一辆依次交替驶入车道减少后的路口、路段。');
INSERT INTO `question` VALUES ('1012', '驾驶机动车遇到前方车辆停车排队等候或缓慢行驶时怎么办？', '选择题', 'A、可借道超车', 'B、依次行驶', 'C、穿插等候的车辆', 'D、占用对面车道\r\n', 'b', '《道路交通安全法》第四十五条：\r\n机动车遇有前方车辆停车排队等候或者缓慢行驶时，不得借道超车或者占用对面车道,不得穿插等候的车辆。');
INSERT INTO `question` VALUES ('1013', '驾驶机动车遇有前方交叉路口交通阻塞时怎么办？', '选择题', 'A、进入路口内等候', 'B、可借对向车道通过', 'C、依次停在路口外等候', 'D、从前车两侧穿插通过\r\n', 'c', '《实施条例》第五十三条：\r\n机动车遇有前方交叉路口交通阻塞时，应当依次停在路口以外等候，不得进入路口。');
INSERT INTO `question` VALUES ('1014', '机动车在道路上发生故障，需要停车排除时，驾驶人应该怎么办？', '选择题', 'A、将车停在道路中间', 'B、开启近光灯或雾灯', 'C、就地停车排除故障', 'D、将车停到不妨碍交通的地方\r\n', 'd', '机动车在行驶道路上发生故障，应将机动车移至不妨碍交通的地方停放，并要在来车方向的50—100米的地方设置警示标志。');
INSERT INTO `question` VALUES ('1015', '机动车在道路上发生故障，难以移动时下列做法正确的是什么？', '选择题', 'A、禁止车上人员下车', 'B、开启危险报警闪光灯', 'C、开启车上所有灯光', 'D、在车前方设置警告标志\r\n', 'b', '《实施条例》第六十条：\r\n机动车在道路上发生故障或者发生交通事故，妨碍交通又难以移动的，应当按照规定开启危险报警闪光灯并在车后50米至100米处设置警告标志，夜间还应当同时开启示廓灯和后位灯。');
INSERT INTO `question` VALUES ('1016', '在超越前车时，提前开启左转向灯，变换使用远、近光灯或者鸣喇叭是为了什么？', '选择题', 'A、仅提醒前车', 'B、提醒后车以及前车', 'C、仅提醒后车', 'D、提醒行人\r\n', 'b', '超车时使用变换远、近光灯是提醒前车和后车的意思。');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(10) NOT NULL auto_increment,
  `s_username` varchar(255) NOT NULL,
  `s_password` varchar(255) NOT NULL,
  `s_phone` varchar(20) default NULL,
  `s_sex` varchar(20) default NULL,
  `s_time` timestamp NULL default NULL,
  `s_name` varchar(255) default NULL,
  `s_result` varchar(20) default NULL,
  `s_coach` varchar(20) default NULL,
  `s_discount` varchar(20) default NULL,
  `s_free_statue` varchar(20) default NULL,
  `s_c_type` varchar(20) default NULL,
  `s_statue` varchar(20) default NULL,
  `s_d_address` varchar(255) default NULL,
  `s_address` varchar(255) default NULL,
  `s_cardid` varchar(255) default NULL,
  `s_age` varchar(10) default NULL,
  PRIMARY KEY  (`student_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('11', 'xue13212345678', '132', '13212345678', '男', '2018-03-07 00:00:00', '悦涵博', '否', '董新忠', '“五一“报名优惠500', '预缴1000元', 'C1', '是', '陕西省安康市石泉县饶峰镇', '商丘市平原中路55号', '100101199909090036', '22');
INSERT INTO `student` VALUES ('33', 'xue13312345678', '133', '13312345678', '女', '2018-05-06 00:00:00', '玉玉', '否', '董新忠', '无', '无', 'C1', '是', '陕西省安康市石泉县', '陕西省安康市石泉县', '232323424312323123', '33');
INSERT INTO `student` VALUES ('32', 'xue13412345678', '134', '13412345678', '男', '2018-05-01 00:00:00', '张朋', '否', '董新忠', '无', '无', 'C1', '是', '陕西省安康市石泉县', '河南省商丘市', '123123123123123123', '25');
