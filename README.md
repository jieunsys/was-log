# was-log

1. set logfilename >> TailConfig

	@PostConstruct
	public void executeAsync() {
		String logfilePath = "c:/tmp/tmp.log";


2. set uri (ws://...) >> WebSocketConfig

		registry.addHandler(webSocketHandler, "/webtail1").setAllowedOrigins("*");



After a springboot build
java -jar was-log.jar, you will see that

TailThread starts reading the log file c:/tmp/tmp.log

If you connect to http://localhost:8087/index.html with a browser
You can view the log file with tail -f

