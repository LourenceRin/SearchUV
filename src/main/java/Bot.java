import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot
{
  public static void main(String[] args) {
    ApiContextInitializer.init(); // Инициализируем апи
    TelegramBotsApi botapi = new TelegramBotsApi();
    try {
      botapi.registerBot(new Bot());
    } catch (TelegramApiException e) {
      e.printStackTrace();
    }
  }
  @Override
  public String getBotUsername() {
    return "SearcheUV_bot";
  }

  @Override
  public void onUpdateReceived(Update e) {

  }

  @Override
  public String getBotToken() {
    return "666128715:AAGK9RxwDZ_OIbSYnbQ8tUflqEIuhVlmvyE";
  }

}
