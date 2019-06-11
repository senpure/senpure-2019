package ${javaHandlerPack};

import ${javaPack}.${type}${name}Message;
import com.senpure.io.handler.AbstractMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**<#if hasExplain>
 * ${explain}处理器
 * </#if>
${sovereignty}
 * @time      ${.now?datetime}
 */
@Component
public class ${type}${name}MessageHandler extends AbstractMessageHandler<${type}${name}Message> {

    @Override
    public void execute(Channel channel, ${type}${name}Message message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
               // ${.now?datetime} ${id?c}
        return ${type}${name}Message.MESSAGE_ID;
    }

    @Override
    public ${type}${name}Message getEmptyMessage() {
        return new ${type}${name}Message();
    }

}