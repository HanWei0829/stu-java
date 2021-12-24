package cn.soul;


import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @function 功能 :     启动类
 * @author   创建人:    hw
 * @date     创建日期:  2020年6月16日
 */
@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("main 已启动 ...");
	}



	/**
	 * <p>项目启动时运行 </p>
	 *
	 * @author hw
	 * @date 2021/3/9 9:54
	 * @param
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println("springboot 已启动 ...");
		/**
		 * 多线程用法
		 */
//		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10); // 创建线程池
//		for (int i = 0; i < 10; i++) {
//			Future<?> future = fixedThreadPool.submit(new Runnable() {
//				@SneakyThrows
//				@Override
//				public void run() {
//					while (true) {
//						SubmeterHaixinData haixinData = null;
//						try {
//							haixinData = MyQueue.queue.take(); // 阻塞式获取队列中海心开/关阀数据
//						} catch (InterruptedException e) {
//							log.error(e.getMessage(), e);
//						}
//						int i;
//						Boolean aBoolean = haixinDataService.setValve(haixinData); // 第一次下发
//						/**
//						 * 进循环判断下发是否成功；
//						 * 不成功则重试6次；
//						 * 6次还不成功则生成报警信息；
//						 */
//						for (i = 0; i < 7; i++) {
//							if (aBoolean) {
//								log.info("---分户表-用户编号为：" + haixinData.getHousecode() + "，海心缴费(开/关阀)-成功，程序结束!");
//								break;
//							} else {
//								if (i == 6) {
//									log.info("---分户表-用户编号为：" + haixinData.getHousecode() + "，海心缴费(开/关阀)-重试6次后依然失败，触发报警程序...");
//									//生成报警信息-待完成
//									break;
//								}
//								log.info("---分户表-用户编号为：" + haixinData.getHousecode() + "，海心缴费(开/关阀)-失败，十分钟后发起第" + (i + 1) + "次重复请求...");
//								Thread.sleep(1000 * 600); // 十分钟
//								aBoolean = haixinDataService.setValve(haixinData);
//							}
//						}
//					}
//				}
//			});
//		}
	}
}
