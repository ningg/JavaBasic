package top.ningg.java.basic;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;
import top.ningg.java.model.Project;
import top.ningg.java.model.enums.ProjectTicketStatusEnum;


/**
 * Created by guoning on 16/3/25.
 */
public class TestApacheBeanUtils {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Project project = new Project();
        project.setId(1);
        project.setBeneficiaryId(20);
        project.setTicketStatus(ProjectTicketStatusEnum.PRESELL);
        project.setModified(new Date());
        project.setAudited(false);

//        TProject tProject = new TProject();
//        BeanUtils.copyProperties(tProject, project);
//
//        System.out.println(tProject);

    }
}
