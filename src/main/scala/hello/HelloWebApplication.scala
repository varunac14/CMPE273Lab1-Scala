package hello

import org.springframework.boot.SpringApplication

/**
 *
 * @author Varuna Chenna Keshava
 * @since 1.0
 */

object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}
