package com.mvgm.snug_server.core.usecases;

public class BuildEmailUseCase {

    private String confirmAccountTemplate(String name, String link) {
        return "<div style=\"display: flex; flex-direction: column; background-color: #333333; max-width: 400px; height: auto; border-radius: 16px; padding: 0.5rem; border: solid 2px #0b0c0c;\">\n" +
               "  <div style=\"display: flex; align-items: center; font-family: Poppins, Arial, Helvetica, sans-serif; font-size: 0.8rem; color: #0b0c0c; padding: 0.5rem; background-color: #0b0c0c; border-radius: 16px;\">\n" +
               "    <table role=\"presentation\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse: collapse; width: 100% !important\" width=\"100%\">\n" +
               "      <tbody>\n" +
               "        <tr>\n" +
               "          <td height=\"30\"><br /></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td width=\"10\" valign=\"middle\"><br /></td>\n" +
               "          <td>\n" +
               "            <p style=\"margin: 0 0 10px 0; font-size: 0.8rem; line-height: 1.5rem; color: #ffffff; max-width: 250px;\">Olá, " + name + ", bem-vindo!</p>\n" +
               "            <p style=\"margin: 0 0 10px 0; font-size: 0.8rem; line-height: 1.5rem; color: #ffffff; max-width: 350px;\">Obrigado por cadastrar-se na Snug! Por favor, clique no link abaixo para ativar sua conta:</p>\n" +
               "            <blockquote style=\"margin: 0 0 15px 0; border-left: 8px solid #212121; padding: 10px 0 0px 10px; font-size: 0.8rem; line-height: 1.5rem;\">\n" +
               "              <a href=\"" + link + "\" style=\"text-decoration: none; display: inline-block;\">\n" +
               "                <button style=\"height: 38px; width: 158px; border-radius: 8px; background-color: #0b0c0c; color: #ffffff; cursor: pointer; transition: background-color 0.5s ease; font-size: 10px; border: solid 2px #0b0c0c; padding: 0; margin: 0;\" onmouseover=\"this.style.backgroundColor='#212121';\" onmouseout=\"this.style.backgroundColor='#0b0c0c';\">Clique aqui!</button>\n" +
               "              </a>\n" +
               "            </blockquote>\n" +
               "            <p style=\"color: #ffffff; font-size: 12px\">O link vai expirar em 20 minutos.</p>\n" +
               "            <p style=\"color: #ffffff; font-size: 12px\">Te vejo em breve!</p>\n" +
               "          </td>\n" +
               "          <td width=\"10\" valign=\"middle\"><br /></td>\n" +
               "        </tr>\n" +
               "        <tr>\n" +
               "          <td height=\"30\"><br /></td>\n" +
               "        </tr>\n" +
               "      </tbody>\n" +
               "    </table>\n" +
               "  </div>\n" +
               "  <div>\n" +
               "    <img style=\"display: block; max-width: 6rem; margin: 20px 0 0 20px;\" src=\"../assets/images/snugnew.png\" alt=\"Logo Snug\" />\n" +
               "  </div>\n" +
               "</div>";
    }
}
