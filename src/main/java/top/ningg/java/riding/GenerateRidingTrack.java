package top.ningg.java.riding;

import java.util.Date;

/**
 * Created by guoning on 2017/10/17.
 */
public class GenerateRidingTrack {

    private static final String START_SPLITTER = "#";
    private static final String LNG_LAT_SPLITTER = ",";
    private static final String LNG_LAT_AND_TIMESTAMP_SPLITTER = ";";

    public static void main(String[] args) {
        // 订单起始时间、截止时间(时长: 50 mins)
        // long orderStartTime = new Date().getTime();
        long orderStartTime = 1508217014000L;
        long orderEndTime = orderStartTime + 50 * 60 * 1000;

        // 构造测试数据的经纬度坐标基点
        String lngBase = "116.46831";
        String latBase = "39.948516";
        // 每 6s 上报一个坐标, 50mins 内,最多 500 个点;
        double deltaLat = 0.000002d;
        long deltaTime = 6 * 1000;

        long currTimestamp = orderStartTime;
        double currLng = Double.valueOf(lngBase);
        double currLat = Double.valueOf(latBase);

        // App 上报的原始骑行轨迹
        String oriTrackTime = null;
        StringBuilder trackTimeBuilder = new StringBuilder();
        // 场景 3: 输入包含, 近似经纬度0点
        trackTimeBuilder.setLength(0);
        String apprZeroLng = "4.9E-324";
        String apprZeroLat = "4.9E-324";
        currTimestamp = orderStartTime;
        currLng = Double.valueOf(lngBase);
        currLat = Double.valueOf(latBase);
        for (int index = 0; index < 400; index++) {
            currTimestamp += deltaTime;
            currLat += index * deltaLat;
            int mod = index % 10;
            if (mod == 1) {
                // 中间设置 40 个点为:'经纬度 0 点'
                trackTimeBuilder.append(START_SPLITTER).append(apprZeroLng).append(LNG_LAT_SPLITTER).append(apprZeroLat).append(LNG_LAT_AND_TIMESTAMP_SPLITTER).append(currTimestamp);
            } else {
                trackTimeBuilder.append(START_SPLITTER).append(currLng).append(LNG_LAT_SPLITTER).append(currLat).append(LNG_LAT_AND_TIMESTAMP_SPLITTER).append(currTimestamp);
            }
        }

        System.out.printf(trackTimeBuilder.toString());
    }
}
