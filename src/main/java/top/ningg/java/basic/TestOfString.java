package top.ningg.java.basic;

import org.apache.commons.lang3.StringUtils;

public class TestOfString {

    public static void main(String[] args) {
        String input = "《密室3之不可逃脱》";
        String result = extractProductName(input);
        System.out.println(result);

        System.out.println(String.format("%s%s%%的%s", "100","4999", "230"));
        System.out.println(String.format("shdfhasdf : %s", null));

        String msg = "SQL [insert into `abacus_order`.`refund_order` (`order_id`, `user_id`, `total_amount`, `refunded_amount`, `channel`, `created_at`, `first_requested_at`, `last_requested_at`, `error_code`, `error_msg`, `refund_id`, `status`, `times`, `user_name`, `mobile`, `pay_partner_id`) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)]; Duplicate entry 'MBK07552018010410572575946477' for key 'uniq_order_id'\n" +
                "\tat org.springframework.kafka.listener.adapter.MessagingMessageListenerAdapter.invokeHandler(MessagingMessageListenerAdapter.java:188)\n" +
                "\tat org.springframework.kafka.listener.adapter.BatchMessagingMessageListenerAdapter.onMessage(BatchMessagingMessageListenerAdapter.java:118)\n" +
                "\tat org.springframework.kafka.listener.adapter.BatchMessagingMessageListenerAdapter.onMessage(BatchMessagingMessageListenerAdapter.java:56)\n" +
                "\tat org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer.invokeBatchListener(KafkaMessageListenerContainer.java:751)\n" +
                "\tat org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer.invokeListener(KafkaMessageListenerContainer.java:735)\n" +
                "\tat org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer.access$2200(KafkaMessageListenerContainer.java:245)\n" +
                "\tat org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer$ListenerInvoker.run(KafkaMessageListenerContainer.java:1031)\n" +
                "\tat java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)\n" +
                "\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)";

        System.out.println(msg.contains("Duplicate") || msg.contains("duplicate"));
    }

    // 去掉产品名称前后的书名号
    private static String extractProductName(String productName) {
        String result = StringUtils.isEmpty(productName) ? "" : StringUtils.trim(productName);
        if (result.contains("《")) {
            result = result.substring(result.indexOf("《") + 1, result.indexOf("》"));
        }
        return result;
    }
}
