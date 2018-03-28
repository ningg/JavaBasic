package top.ningg.java.basic;

import org.springframework.beans.BeanUtils;
import top.ningg.java.model.Project;
import top.ningg.java.model.enums.ProjectTicketStatusEnum;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by guoning on 16/3/25.
 */
public class TestSpringBeanUtils {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        /*Project project = new Project();
        project.setId(1);
        project.setBeneficiaryId(20);
        project.setTicketStatus(ProjectTicketStatusEnum.PRESELL);
        project.setModified(new Date());
        project.setAudited(false);

        TProject tProject = new TProject();
        String[] ignoreFields = {"source", "ticketStatus", "promotionStatus", "startDate", "endDate", "onTime", "offTime", "created", "modified"};
        BeanUtils.copyProperties(project, tProject,ignoreFields);

        System.out.println(tProject);*/

    }
}
