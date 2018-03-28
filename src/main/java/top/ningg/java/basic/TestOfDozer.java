package top.ningg.java.basic;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by guoning on 16/3/25.
 */
public class TestOfDozer {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        int[] timeArea = {1, 1, 10, 100, 1000, 10000, 100000};
        for (int single : timeArea) {
            testDozer(single);
        }
    }

    public static void testDozer(int times) throws InvocationTargetException, IllegalAccessException {
//        System.out.println("Times:" + times + "-------");
//
//        List myMappingFiles = new ArrayList();
//        // myMappingFiles.add("dozerBeanMapping.xml");
//        DozerBeanMapper mapper = new DozerBeanMapper();
//        mapper.setMappingFiles(myMappingFiles);
//
//        long startTime = System.currentTimeMillis();
//        Project project = new Project();
//        project.setId(1);
//        project.setBeneficiaryId(20);
//        project.setTicketStatus(ProjectTicketStatusEnum.PRESELL);
//        project.setStartDate(new Date());
//        project.setEndDate(new Date());
//        project.setOnTime(new Date());
//        project.setOffTime(new Date());
//        project.setModified(new Date());
//        project.setCreated(new Date());
//        project.setAudited(false);
//        long endTime = System.currentTimeMillis();
////        System.out.println(endTime - startTime);
//
//        startTime = System.currentTimeMillis();
//        TProject destObject = new TProject();
//
//        for (int i = 0; i < times; i++) {
//            project.setBeneficiaryId(i);
//            destObject.setId(project.getId());
//            destObject.setTicketStatus(TProjectTicketStatusEnum.findByValue(project.getTicketStatus().getOrdinal()));
//            destObject.setModified(project.getModified().getTime());
//            destObject.setAudited(project.isAudited());
//
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("getter And setter:" + (endTime - startTime));
//
//        startTime = System.currentTimeMillis();
//        ProjectBak projectBak = new ProjectBak();
//        for (int i = 0; i < times; i++) {
//            project.setBeneficiaryId(i);
//            org.apache.commons.beanutils.BeanUtils.copyProperties(projectBak, project);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Apache BeanUtils:" + (endTime - startTime));
//
//        startTime = System.currentTimeMillis();
//        ProjectBak projectBak2 = new ProjectBak();
//        for (int i = 0; i < times; i++) {
//            project.setBeneficiaryId(i);
//            BeanUtils.copyProperties(project, projectBak2);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Spring BeanUtils:" + (endTime - startTime));
//
//
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < times; i++) {
//            project.setBeneficiaryId(i);
//            destObject = mapper.map(project, TProject.class);
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("Dozer:" + (endTime - startTime));
//
//        Area area = new Area();
//        area.setDeleted(false);
//        area.setHeight(10);
//
//        Map<String, Seat> seatMap = Maps.newHashMap();
//
//        Seat seatA = new Seat();
//        seatA.setCol(1);
//        seatA.setName("Seat A");
//
//        Seat seatB = new Seat();
//        seatB.setCol(2);
//        seatB.setName("Seat B");
//
//        seatMap.put("A", seatA);
//        seatMap.put("B", seatB);
//
//        area.setSeats(seatMap);
//
//        startTime = System.currentTimeMillis();
//        TArea tArea;
//        for (int i = 0; i < times; i++) {
//            tArea = mapper.map(area, TArea.class);
//        }
//        endTime = System.currentTimeMillis();

//        System.out.println(endTime - startTime);
//        System.out.println("Result");

    }
}
