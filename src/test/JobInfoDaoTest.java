package test;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.web.demo.dao.JobInfoDAO;
import cn.web.demo.model.LieTouJobInfo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/applicationContext-*.xml"})
public class JobInfoDaoTest {
    @Resource
    private JobInfoDAO jobInfoDAO;

    @Ignore
    @Test
    public void test() {
        LieTouJobInfo jobInfo = new LieTouJobInfo();
        jobInfo.setSource("a");
        try {
            final int add = jobInfoDAO.add(jobInfo);
            System.out.println(add);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
