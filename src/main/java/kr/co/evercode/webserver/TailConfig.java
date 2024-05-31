package kr.co.evercode.webserver;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import kr.co.evercode.tailer.TailThread;

@Service
public class TailConfig {

	@Autowired
	private TaskExecutor taskExecutor;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@PostConstruct
	public void executeAsync() {
		String logfilePath = "c:/tmp/tmp.log";
		if(File.separator.equals("/")) logfilePath = "/tmp/tmp.log";
		
		TailThread tailThread = applicationContext.getBean(TailThread.class);
		tailThread.setLogfile(logfilePath);
		taskExecutor.execute(tailThread);
	}
}
