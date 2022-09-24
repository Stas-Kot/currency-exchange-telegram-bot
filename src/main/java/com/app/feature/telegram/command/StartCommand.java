package com.app.feature.telegram.command;


import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.User;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.bots.AbsSender;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class StartCommand extends BotCommand {
    public StartCommand() {
        super("start", "With this command you can start the Bot");
    }

    @Override
    public void execute(AbsSender absSender, User user, Chat chat, String[] arguments) {
        System.out.println("Start pressed!");
        String text = "Welcome! This bot will help you track current exchange rates...";
        SendMessage message = new SendMessage();
        message.setText(text);
        message.setChatId(chat.getId().toString());

        KeyboardButton getInfoButton = KeyboardButton.builder().text("/get_info").build();
        KeyboardButton settingsButton = KeyboardButton.builder().text("/settings").build();

        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(getInfoButton);

        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow2.add(settingsButton);

        ReplyKeyboardMarkup keyboard = ReplyKeyboardMarkup
                .builder()
                .keyboardRow(keyboardRow1)
                .keyboardRow(keyboardRow2)
                .build();

        message.setReplyMarkup(keyboard);

        try {
            absSender.execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
