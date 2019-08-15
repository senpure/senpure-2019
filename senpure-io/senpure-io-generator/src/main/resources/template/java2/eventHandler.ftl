package ${javaHandlerPackage};

import ${javaPackage}.${name}Event;
import com.senpure.io.handler.AbstractEventHandler;
import org.springframework.stereotype.Component;

/**<#if hasExplain>
 * ${explain} 事件处理器
 *</#if>
${sovereignty}
 * @time ${.now?datetime}
 */
@Component
public class ${name}EventHandler extends AbstractEventHandler<${name}Event> {

    @Override
    public void execute(${name}Event event) {
        //TODO 请在这里写下你处理${name}Event的代码，并删除该条注释

    }

    @Override
    public int handlerId() {
                //${.now?datetime} ${id?c}
        return ${name}Event.EVENT_ID;
    }

    @Override
    public ${name}Event getEmptyEvent() {
        return new ${name}Event();
    }
}