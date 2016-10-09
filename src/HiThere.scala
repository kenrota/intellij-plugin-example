import com.intellij.notification.{Notification, NotificationType, Notifications}
import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent}

class HiThere extends AnAction {
  def actionPerformed(e: AnActionEvent): Unit = {
    Notifications.Bus.notify(
      new Notification("example", "Notification example", "Hi there!", NotificationType.INFORMATION)
    )
  }
}
