package cn.web.demo.OutputMange;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.web.demo.dao.JobInfoDAO;
import cn.web.demo.model.LieTouJobInfo;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;



@Component("JobInfoDaoPipeline")
public class JobInfoDaoPipeline implements PageModelPipeline<LieTouJobInfo> {

    @Resource
    private JobInfoDAO jobInfoDAO;
	@Override
	 public void process(LieTouJobInfo lieTouJobInfo, Task task) {
        jobInfoDAO.add(lieTouJobInfo);
    }
}
