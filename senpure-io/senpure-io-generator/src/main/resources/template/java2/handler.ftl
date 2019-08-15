package ${javaHandlerPackage};

import ${javaPackage}.${type}${name}Message;
import com.senpure.io.handler.AbstractRealityMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**<#if hasExplain>
 * ${explain}处理器
 *</#if>
${sovereignty}
 * @time ${.now?datetime}
 */
@Component
public class ${type}${name}MessageHandler extends AbstractRealityMessageHandler<${type}${name}Message> {

    @Override
    public void execute(Channel channel, long token, long userId, ${type}${name}Message message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
                //${.now?datetime} ${id?c}
        return ${type}${name}Message.MESSAGE_ID;
    }

    @Override
    public ${type}${name}Message getEmptyMessage() {
        return new ${type}${name}Message();
    }
}