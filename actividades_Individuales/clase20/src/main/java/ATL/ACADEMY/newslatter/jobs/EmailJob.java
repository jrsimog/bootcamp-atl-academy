package ATL.ACADEMY.newslatter.jobs;

import org.springframework.scheduling.annotation.Scheduled;

public class EmailJob {

    @Scheduled(cron = "0 0 0 * * ?")
    public String generarTareaAutomatica() {
        return "hola";
    }

}
