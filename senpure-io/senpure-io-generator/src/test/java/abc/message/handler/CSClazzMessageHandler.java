package abc.message.handler;

import abc.message.CSClazzMessage;
import com.senpure.io.producer.handler.AbstractProducerMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**
 * 7788处理器
 *
 * @author senpure
 * @time 2019-6-12 16:39:40
 */
@Component
public class CSClazzMessageHandler extends AbstractProducerMessageHandler<CSClazzMessage> {

    @Override
    public void execute(Channel channel, long token, long userId, CSClazzMessage message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
                //2019-6-12 16:39:40 1001
        return CSClazzMessage.MESSAGE_ID;
    }

    @Override
    public CSClazzMessage getEmptyMessage() {
        return new CSClazzMessage();
    }
}