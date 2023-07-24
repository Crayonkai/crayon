package com.crayon.note.service.impl;

import com.crayon.note.domain.Emp;
import com.crayon.note.mapper.DeptMapper;
import com.crayon.note.mapper.EmpMapper;
import com.crayon.note.mapper.SalgradeMapper;
import com.crayon.note.service.CrInsertTestDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

@Service
@Slf4j
public class CrInsertTestDataServiceImpl implements CrInsertTestDataService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public int insert500WData() {

        Emp emp = new Emp();
        for (int i = 0; i < 1000000; i++) {
            emp.setEmpno(getRandomDeptNo(i));
            Random random = new Random();
            int i1 = random.nextInt(100);
            emp.setEname(getRandomName(i1 % 2));
            emp.setJob(getRandomJob(i1));
            long l = System.currentTimeMillis();
            int startTime = 710440080;
            Long i2 = (Long) (random.nextInt(startTime) * 1000L);
            Date date = new Date(l - i2);
            emp.setHiredate(date);
            int i3 = random.nextInt(3000000);
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(i3 / 100) + "." + String.valueOf(i3 % 100));
            emp.setSal(bigDecimal);
            int i4 = random.nextInt(3000000);
            BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(i4 / 100) + "." + String.valueOf(i4 % 100));
            emp.setComm(bigDecimal1);
            int i5 = random.nextInt(5) + 1;
            emp.setDeptno(i5);
            int i6 = 0;
            try {
                i6 = empMapper.insertSelective(emp);
                log.info("第" + i + "条新增" + (i6 == 1 ? "成功" : "失败"));
            } catch (Exception se) {
                log.info("第" + i + "条新增" + (i6 == 1 ? "成功" : "失败"));
            }
        }

        return 0;
    }

    public static String getRandomName(int sex) {
        Random random = new Random();
        String[] Surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
                "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏",
                "潘", "葛", "奚", "范", "彭", "郎", "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳", "酆", "鲍", "史", "唐",
                "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于", "时", "傅", "皮", "卞",
                "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆", "萧", "尹", "姚", "邵", "湛", "汪", "祁", "毛", "禹", "狄",
                "米", "贝", "明", "臧", "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒", "屈", "项", "祝", "董", "梁", "杜", "阮",
                "蓝", "闵", "席", "季"};
        String girl = "秀娟英华慧巧美娜静淑惠珠翠雅芝玉萍红娥玲芬芳燕彩春菊兰凤洁梅琳素云莲真环雪荣爱妹霞香月莺媛艳瑞凡佳嘉琼勤珍贞莉桂娣叶璧璐娅琦晶妍茜秋珊莎锦黛青倩婷姣婉娴瑾颖露瑶怡婵雁蓓纨仪荷丹蓉眉君琴蕊薇菁梦岚苑婕馨瑗琰韵融园艺咏卿聪澜纯毓悦昭冰爽琬茗羽希宁欣飘育滢馥筠柔竹霭凝晓欢霄枫芸菲寒伊亚宜可姬舒影荔枝思丽 ";
        String boy = "伟刚勇毅俊峰强军平保东文辉力明永健世广志义兴良海山仁波宁贵福生龙元全国胜学祥才发武新利清飞彬富顺信子杰涛昌成康星光天达安岩中茂进林有坚和彪博诚先敬震振壮会思群豪心邦承乐绍功松善厚庆磊民友裕河哲江超浩亮政谦亨奇固之轮翰朗伯宏言若鸣朋斌梁栋维启克伦翔旭鹏泽晨辰士以建家致树炎德行时泰盛雄琛钧冠策腾楠榕风航弘";
        int index = random.nextInt(Surname.length - 1);
        String name = Surname[index]; //获得一个随机的姓氏
        if (sex == 1) {// 女
            int j = random.nextInt(girl.length() - 2);
            if (j % 2 == 0) {
                name = name + girl.substring(j, j + 2);
            } else {
                name = name + girl.substring(j, j + 1);
            }
        } else if (sex == 0) {//男
            int j = random.nextInt(boy.length() - 2);
            if (j % 2 == 0) {
                name = name + boy.substring(j, j + 2);
            } else {
                name = name + boy.substring(j, j + 1);
            }
        } else {
            name = "不正常";
        }
        return name;
    }

    public static Long getRandomDeptNo(int i) {
        Random random = new Random();
        String ide = String.valueOf((10000 + i) * (random.nextInt(9) + 1)).substring(1, 5);
        String id = "10" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHHmmss")) + ide;
        return Long.valueOf(id.trim());
    }

    public static String getRandomJob(int i) {
        String[] jobs = {"老师", "快递员", "软件工程师", "保安", "厨师", "司机", "飞行员", "公务员", "售货员", "网红", "警察",
                "务农", "会计", "水手", "演员", "画家", "汽修工", "java研发工程师", "外卖骑手", "主持人"};
        if (i == 1) {
            return "主持人";
        } else if (i == 2) {
            return "画家";
        } else if (i == 3) {
            return "飞行员";
        } else if (i == 4 || i == 5) {
            return "警察";
        } else if (i > 5 && i < 8) {
            return "公务员";
        } else if (i > 8 && i < 13) {
            return "售货员";
        } else if (i > 13 && i < 20) {
            return "软件工程师";
        } else if (i > 20 && i < 22) {
            return "水手";
        } else if (i > 22 && i < 30) {
            return "快递员";
        } else if (i > 30 && i < 40) {
            return "外卖骑手";
        } else if (i == 40) {
            return "java研发工程师";
        } else if (i > 40 && i < 50) {
            return "网红";
        } else if (i > 50 && i < 70) {
            return "务农";
        } else if (i > 70 && i < 75) {
            return "老师";
        } else if (i > 75 && i < 82) {
            return "保安";
        } else if (i > 82 && i < 85) {
            return "厨师";
        } else if (i > 85 && i < 88) {
            return "司机";
        } else if (i > 88 && i < 91) {
            return "会计";
        } else if (i > 91 && i < 94) {
            return "演员";
        } else if (i > 94 && i < 99) {
            return "汽修工";
        } else {
            return "其他";
        }
    }

    public static void main(String[] args) {
        CrInsertTestDataServiceImpl crInsertTestDataService = new CrInsertTestDataServiceImpl();
        int i = crInsertTestDataService.insert500WData();
    }
}
