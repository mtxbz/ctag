package org.ctnb.back.app.tgrm.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@RequiredArgsConstructor
@Slf4j
public class TelegramBot extends TelegramLongPollingBot {
//    public final BotProperties botProperties;
//
//    public final CommandsHandler commandsHandler;
//
//    public final CallbacksHandler callbacksHandler;

    @Override
    public String getBotUsername() {
//        return botProperties.getName();
        return "your_bot_name";
    }

    @Override
    public String getBotToken() {
//        return botProperties.getToken();
        return "your_bot_token";
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println();
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            String chatId = update.getMessage().getChatId().toString();
//            if (update.getMessage().getText().startsWith("/")) {
//                sendMessage(commandsHandler.handleCommands(update));
//            } else {
//                sendMessage(new SendMessage(chatId, Consts.CANT_UNDERSTAND));
//            }
//        } else if (update.hasCallbackQuery()) {
//            sendMessage(callbacksHandler.handleCallbacks(update));
//        }
    }

    private void sendMessage(SendMessage sendMessage) {
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            log.error(e.getMessage());
        }
    }
}
