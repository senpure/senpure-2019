package abc.event.handler;

import abc.event.HiEvent;
import com.senpure.io.event.handler.AbstractEventHandler;
import org.springframework.stereotype.Component;

/**
 * @author senpure
 * @time 2019-6-12 16:39:40
 */
@Component
public class HiEventHandler extends AbstractEventHandler<HiEvent> {

    @Override
    public void execute(HiEvent event) {
        //TODO 请在这里写下你处理HiEvent的代码，并删除该条注释

    }

    @Override
    public int handlerId() {
                //2019-6-12 16:39:40 1001
        return HiEvent.EVENT_ID;
    }

    @Override
    public HiEvent getEmptyEvent() {
        return new HiEvent();
    }
}