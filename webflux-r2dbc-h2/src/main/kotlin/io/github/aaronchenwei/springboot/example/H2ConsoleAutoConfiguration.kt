package io.github.aaronchenwei.springboot.example

import org.h2.tools.Server
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.sql.SQLException

@Component
class H2ConsoleAutoConfiguration {

  private var webServer: Server? = null

  private var tcpServer: Server? = null

  @EventListener(ContextRefreshedEvent::class)
  @Throws(SQLException::class)
  fun start() {
    webServer = Server.createWebServer("-webPort", "8082", "-tcpAllowOthers").start()
    tcpServer = Server.createTcpServer("-tcpPort", "9092", "-tcpAllowOthers").start()
  }

  @EventListener(ContextClosedEvent::class)
  fun stop() {
    tcpServer?.stop()
    webServer?.stop()
  }
}
