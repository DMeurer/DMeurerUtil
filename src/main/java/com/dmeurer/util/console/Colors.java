package com.dmeurer.util.console;

/**
 * This enum contains all color-codes you can use with ANSI.<br>
 * To show all colors, use
 * printAllColors()<br>
 * To use custon colors
 */

public enum Colors {
    RESET(Colors.ESC + "[0m"),

    FORMAT_BOLD(Colors.ESC + "[1m"),
    FORMAT_DIM(Colors.ESC + "[2m"),
    FORMAT_ITALIC(Colors.ESC + "[3m"),
    FORMAT_UNDERLINE(Colors.ESC + "[4m"),
    FORMAT_BLINK_SLOW(Colors.ESC + "[5m"),
    FORMAT_BLINK_RAPID(Colors.ESC + "[6m"),
    FORMAT_REVERSE(Colors.ESC + "[7m"),
    FORMAT_HIDDEN(Colors.ESC + "[8m"),
    FORMAT_STRIKETHROUGH(Colors.ESC + "[9m"),

    FORMAT_FRACTURE(Colors.ESC + "[21m"),
    FORMAT_UNDERLINE_DOUBLE(Colors.ESC + "[21m"),

    FORMAT_FRAMED(Colors.ESC + "[51m"),
    FORMAT_ENCIRCLED(Colors.ESC + "[52m"),


    REGULAR_FONT_BLACK(Colors.ESC + "[30m"),   // BLACK
    REGULAR_FONT_RED(Colors.ESC + "[31m"),     // RED
    REGULAR_FONT_GREEN(Colors.ESC + "[32m"),   // GREEN
    REGULAR_FONT_YELLOW(Colors.ESC + "[33m"),  // YELLOW
    REGULAR_FONT_BLUE(Colors.ESC + "[34m"),    // BLUE
    REGULAR_FONT_PURPLE(Colors.ESC + "[35m"),  // PURPLE
    REGULAR_FONT_CYAN(Colors.ESC + "[36m"),    // CYAN
    REGULAR_FONT_WHITE(Colors.ESC + "[37m"),   // WHITE

    REGULAR_BACKGROUND_BLACK(Colors.ESC + "[40m"),   // BLACK
    REGULAR_BACKGROUND_RED(Colors.ESC + "[41m"),     // RED
    REGULAR_BACKGROUND_GREEN(Colors.ESC + "[42m"),   // GREEN
    REGULAR_BACKGROUND_YELLOW(Colors.ESC + "[43m"),  // YELLOW
    REGULAR_BACKGROUND_BLUE(Colors.ESC + "[44m"),    // BLUE
    REGULAR_BACKGROUND_PURPLE(Colors.ESC + "[45m"),  // PURPLE
    REGULAR_BACKGROUND_CYAN(Colors.ESC + "[46m"),    // CYAN
    REGULAR_BACKGROUND_WHITE(Colors.ESC + "[47m"),   // WHITE


    REGULAR_FONT_BLACK_BRIGHT(Colors.ESC + "[90m"),   // BLACK
    REGULAR_FONT_RED_BRIGHT(Colors.ESC + "[91m"),     // RED
    REGULAR_FONT_GREEN_BRIGHT(Colors.ESC + "[92m"),   // GREEN
    REGULAR_FONT_YELLOW_BRIGHT(Colors.ESC + "[93m"),  // YELLOW
    REGULAR_FONT_BLUE_BRIGHT(Colors.ESC + "[94m"),    // BLUE
    REGULAR_FONT_PURPLE_BRIGHT(Colors.ESC + "[95m"),  // PURPLE
    REGULAR_FONT_CYAN_BRIGHT(Colors.ESC + "[96m"),    // CYAN
    REGULAR_FONT_WHITE_BRIGHT(Colors.ESC + "[97m"),   // WHITE

    REGULAR_BACKGROUND_BLACK_BRIGHT(Colors.ESC + "[100m"),   // BLACK
    REGULAR_BACKGROUND_RED_BRIGHT(Colors.ESC + "[101m"),     // RED
    REGULAR_BACKGROUND_GREEN_BRIGHT(Colors.ESC + "[102m"),   // GREEN
    REGULAR_BACKGROUND_YELLOW_BRIGHT(Colors.ESC + "[103m"),  // YELLOW
    REGULAR_BACKGROUND_BLUE_BRIGHT(Colors.ESC + "[104m"),    // BLUE
    REGULAR_BACKGROUND_PURPLE_BRIGHT(Colors.ESC + "[105m"),  // PURPLE
    REGULAR_BACKGROUND_CYAN_BRIGHT(Colors.ESC + "[106m"),    // CYAN
    REGULAR_BACKGROUND_WHITE_BRIGHT(Colors.ESC + "[107m"),   // WHITE


    ALL_FONT_SYSTEM_BLACK(Colors.ESC + "[38;5;0m"),  // SystemBlack
    ALL_FONT_SYSTEM_MAROON(Colors.ESC + "[38;5;1m"),  // SystemMaroon
    ALL_FONT_SYSTEM_GREEN(Colors.ESC + "[38;5;2m"),  // SystemGreen
    ALL_FONT_SYSTEM_OLIVE(Colors.ESC + "[38;5;3m"),  // SystemOlive
    ALL_FONT_SYSTEM_NAVY(Colors.ESC + "[38;5;4m"),  // SystemNavy
    ALL_FONT_SYSTEM_PURPLE(Colors.ESC + "[38;5;5m"),  // SystemPurple
    ALL_FONT_SYSTEM_TEAL(Colors.ESC + "[38;5;6m"),  // SystemTeal
    ALL_FONT_SYSTEM_SILVER(Colors.ESC + "[38;5;7m"),  // SystemSilver
    ALL_FONT_SYSTEM_GREY(Colors.ESC + "[38;5;8m"),  // SystemGrey
    ALL_FONT_SYSTEM_RED(Colors.ESC + "[38;5;9m"),  // SystemRed
    ALL_FONT_SYSTEM_LIME(Colors.ESC + "[38;5;10m"),  // SystemLime
    ALL_FONT_SYSTEM_YELLOW(Colors.ESC + "[38;5;11m"),  // SystemYellow
    ALL_FONT_SYSTEM_BLUE(Colors.ESC + "[38;5;12m"),  // SystemBlue
    ALL_FONT_SYSTEM_FUCHSIA(Colors.ESC + "[38;5;13m"),  // SystemFuchsia
    ALL_FONT_SYSTEM_AQUA(Colors.ESC + "[38;5;14m"),  // SystemAqua
    ALL_FONT_SYSTEM_WHITE(Colors.ESC + "[38;5;15m"),  // SystemWhite
    ALL_FONT_GREY_0(Colors.ESC + "[38;5;16m"),  // Grey0
    ALL_FONT_NAVY_BLUE(Colors.ESC + "[38;5;17m"),  // NavyBlue
    ALL_FONT_DARK_BLUE(Colors.ESC + "[38;5;18m"),  // DarkBlue
    ALL_FONT_BLUE_2(Colors.ESC + "[38;5;19m"),  // Blue3
    ALL_FONT_BLUE_3(Colors.ESC + "[38;5;20m"),  // Blue3
    ALL_FONT_BLUE_1(Colors.ESC + "[38;5;21m"),  // Blue1
    ALL_FONT_DARK_GREEN(Colors.ESC + "[38;5;22m"),  // DarkGreen
    ALL_FONT_DEEP_SKY_BLUE_7(Colors.ESC + "[38;5;23m"),  // DeepSkyBlue4
    ALL_FONT_DEEP_SKY_BLUE_6(Colors.ESC + "[38;5;24m"),  // DeepSkyBlue4
    ALL_FONT_DEEP_SKY_BLUE_5(Colors.ESC + "[38;5;25m"),  // DeepSkyBlue4
    ALL_FONT_DODGER_BLUE_3(Colors.ESC + "[38;5;26m"),  // DodgerBlue3
    ALL_FONT_DODGER_BLUE_2(Colors.ESC + "[38;5;27m"),  // DodgerBlue2
    ALL_FONT_GREEN_4(Colors.ESC + "[38;5;28m"),  // Green4
    ALL_FONT_SPRING_GREEN_6(Colors.ESC + "[38;5;29m"),  // SpringGreen4
    ALL_FONT_TURQUOISE_2(Colors.ESC + "[38;5;30m"),  // Turquoise4
    ALL_FONT_DEEP_SKY_BLUE_4(Colors.ESC + "[38;5;31m"),  // DeepSkyBlue3
    ALL_FONT_DEEP_SKY_BLUE_3(Colors.ESC + "[38;5;32m"),  // DeepSkyBlue3
    ALL_FONT_DODGER_BLUE_1(Colors.ESC + "[38;5;33m"),  // DodgerBlue1
    ALL_FONT_GREEN_3(Colors.ESC + "[38;5;34m"),  // Green3
    ALL_FONT_SPRING_GREEN_5(Colors.ESC + "[38;5;35m"),  // SpringGreen3
    ALL_FONT_DARK_CYAN(Colors.ESC + "[38;5;36m"),  // DarkCyan
    ALL_FONT_LIGHT_SEA_GREEN(Colors.ESC + "[38;5;37m"),  // LightSeaGreen
    ALL_FONT_DEEP_SKY_BLUE_2(Colors.ESC + "[38;5;38m"),  // DeepSkyBlue2
    ALL_FONT_DEEP_SKY_BLUE_1(Colors.ESC + "[38;5;39m"),  // DeepSkyBlue1
    ALL_FONT_GREEN_2(Colors.ESC + "[38;5;40m"),  // Green3
    ALL_FONT_SPRING_GREEN_2(Colors.ESC + "[38;5;41m"),  // SpringGreen3
    ALL_FONT_SPRING_GREEN_4(Colors.ESC + "[38;5;42m"),  // SpringGreen2
    ALL_FONT_CYAN_3(Colors.ESC + "[38;5;43m"),  // Cyan3
    ALL_FONT_DARK_TURQUOISE(Colors.ESC + "[38;5;44m"),  // DarkTurquoise
    ALL_FONT_TURQUOISE_1(Colors.ESC + "[38;5;45m"),  // Turquoise2
    ALL_FONT_GREEN_1(Colors.ESC + "[38;5;46m"),  // Green1
    ALL_FONT_SPRING_GREEN_1(Colors.ESC + "[38;5;47m"),  // SpringGreen2
    ALL_FONT_SPRING_GREEN_3(Colors.ESC + "[38;5;48m"),  // SpringGreen1
    ALL_FONT_MEDIUM_SPRING_GREEN(Colors.ESC + "[38;5;49m"),  // MediumSpringGreen
    ALL_FONT_CYAN_2(Colors.ESC + "[38;5;50m"),  // Cyan2
    ALL_FONT_CYAN_1(Colors.ESC + "[38;5;51m"),  // Cyan1
    ALL_FONT_DARK_RED_2(Colors.ESC + "[38;5;52m"),  // DarkRed
    ALL_FONT_DEEP_PINK_8(Colors.ESC + "[38;5;53m"),  // DeepPink4
    ALL_FONT_PURPLE_5(Colors.ESC + "[38;5;54m"),  // Purple4
    ALL_FONT_PURPLE_4(Colors.ESC + "[38;5;55m"),  // Purple4
    ALL_FONT_PURPLE_3(Colors.ESC + "[38;5;56m"),  // Purple3
    ALL_FONT_BLUE_VIOLET(Colors.ESC + "[38;5;57m"),  // BlueViolet
    ALL_FONT_ORANGE_4(Colors.ESC + "[38;5;58m"),  // Orange4
    ALL_FONT_GREY_37(Colors.ESC + "[38;5;59m"),  // Grey37
    ALL_FONT_MEDIUM_PURPLE_7(Colors.ESC + "[38;5;60m"),  // MediumPurple4
    ALL_FONT_SLATE_BLUE_3(Colors.ESC + "[38;5;61m"),  // SlateBlue3
    ALL_FONT_SLATE_BLUE_2(Colors.ESC + "[38;5;62m"),  // SlateBlue3
    ALL_FONT_ROYAL_BLUE_1(Colors.ESC + "[38;5;63m"),  // RoyalBlue1
    ALL_FONT_CHARTREUSE_6(Colors.ESC + "[38;5;64m"),  // Chartreuse4
    ALL_FONT_DARK_SEA_GREEN_9(Colors.ESC + "[38;5;65m"),  // DarkSeaGreen4
    ALL_FONT_PALE_TURQUOISE_2(Colors.ESC + "[38;5;66m"),  // PaleTurquoise4
    ALL_FONT_STEEL_BLUE_4(Colors.ESC + "[38;5;67m"),  // SteelBlue
    ALL_FONT_STEEL_BLUE_3(Colors.ESC + "[38;5;68m"),  // SteelBlue3
    ALL_FONT_CORNFLOWER_BLUE(Colors.ESC + "[38;5;69m"),  // CornflowerBlue
    ALL_FONT_CHARTREUSE_5(Colors.ESC + "[38;5;70m"),  // Chartreuse3
    ALL_FONT_DARK_SEA_GREEN_5(Colors.ESC + "[38;5;71m"),  // DarkSeaGreen4
    ALL_FONT_CADET_BLUE_1(Colors.ESC + "[38;5;72m"),  // CadetBlue
    ALL_FONT_CADET_BLUE_2(Colors.ESC + "[38;5;73m"),  // CadetBlue
    ALL_FONT_SKY_BLUE_3(Colors.ESC + "[38;5;74m"),  // SkyBlue3
    ALL_FONT_STEEL_BLUE_2(Colors.ESC + "[38;5;75m"),  // SteelBlue1
    ALL_FONT_CHARTREUSE_3(Colors.ESC + "[38;5;76m"),  // Chartreuse3
    ALL_FONT_PALE_GREEN_3(Colors.ESC + "[38;5;77m"),  // PaleGreen3
    ALL_FONT_SEA_GREEN_3(Colors.ESC + "[38;5;78m"),  // SeaGreen3
    ALL_FONT_AQUAMARINE_3(Colors.ESC + "[38;5;79m"),  // Aquamarine3
    ALL_FONT_MEDIUM_TURQUOISE(Colors.ESC + "[38;5;80m"),  // MediumTurquoise
    ALL_FONT_STEEL_BLUE_1(Colors.ESC + "[38;5;81m"),  // SteelBlue1
    ALL_FONT_CHARTREUSE_2(Colors.ESC + "[38;5;82m"),  // Chartreuse2
    ALL_FONT_SEA_GREEN_2(Colors.ESC + "[38;5;83m"),  // SeaGreen2
    ALL_FONT_SEA_GREEN_1(Colors.ESC + "[38;5;84m"),  // SeaGreen1
    ALL_FONT_SEA_GREEN_4(Colors.ESC + "[38;5;85m"),  // SeaGreen1
    ALL_FONT_AQUAMARINE_1(Colors.ESC + "[38;5;86m"),  // Aquamarine1
    ALL_FONT_DARK_SLATE_GRAY_2(Colors.ESC + "[38;5;87m"),  // DarkSlateGray2
    ALL_FONT_DARK_RED_1(Colors.ESC + "[38;5;88m"),  // DarkRed
    ALL_FONT_DEEP_PINK_7(Colors.ESC + "[38;5;89m"),  // DeepPink4
    ALL_FONT_DARK_MAGENTA_1(Colors.ESC + "[38;5;90m"),  // DarkMagenta
    ALL_FONT_DARK_MAGENTA_2(Colors.ESC + "[38;5;91m"),  // DarkMagenta
    ALL_FONT_DARK_VIOLET_1(Colors.ESC + "[38;5;92m"),  // DarkViolet
    ALL_FONT_PURPLE_2(Colors.ESC + "[38;5;93m"),  // Purple
    ALL_FONT_ORANGE_3(Colors.ESC + "[38;5;94m"),  // Orange4
    ALL_FONT_LIGHT_PINK_3(Colors.ESC + "[38;5;95m"),  // LightPink4
    ALL_FONT_PLUM_4(Colors.ESC + "[38;5;96m"),  // Plum4
    ALL_FONT_MEDIUM_PURPLE_6(Colors.ESC + "[38;5;97m"),  // MediumPurple3
    ALL_FONT_MEDIUM_PURPLE_5(Colors.ESC + "[38;5;98m"),  // MediumPurple3
    ALL_FONT_SLATE_BLUE_1(Colors.ESC + "[38;5;99m"),  // SlateBlue1
    ALL_FONT_YELLOW_6(Colors.ESC + "[38;5;100m"),  // Yellow4
    ALL_FONT_WHEAT_4(Colors.ESC + "[38;5;101m"),  // Wheat4
    ALL_FONT_GREY_53(Colors.ESC + "[38;5;102m"),  // Grey53
    ALL_FONT_LIGHT_SLATE_GREY(Colors.ESC + "[38;5;103m"),  // LightSlateGrey
    ALL_FONT_MEDIUM_PURPLE_2(Colors.ESC + "[38;5;104m"),  // MediumPurple
    ALL_FONT_LIGHT_SLATE_BLUE(Colors.ESC + "[38;5;105m"),  // LightSlateBlue
    ALL_FONT_YELLOW_5(Colors.ESC + "[38;5;106m"),  // Yellow4
    ALL_FONT_DARK_OLIVE_GREEN_6(Colors.ESC + "[38;5;107m"),  // DarkOliveGreen3
    ALL_FONT_DARK_SEA_GREEN_8(Colors.ESC + "[38;5;108m"),  // DarkSeaGreen
    ALL_FONT_LIGHT_SKY_BLUE_2(Colors.ESC + "[38;5;109m"),  // LightSkyBlue3
    ALL_FONT_LIGHT_SKY_BLUE_3(Colors.ESC + "[38;5;110m"),  // LightSkyBlue3
    ALL_FONT_SKY_BLUE_2(Colors.ESC + "[38;5;111m"),  // SkyBlue2
    ALL_FONT_CHARTREUSE_4(Colors.ESC + "[38;5;112m"),  // Chartreuse2
    ALL_FONT_DARK_OLIVE_GREEN_4(Colors.ESC + "[38;5;113m"),  // DarkOliveGreen3
    ALL_FONT_PALE_GREEN_4(Colors.ESC + "[38;5;114m"),  // PaleGreen3
    ALL_FONT_DARK_SEA_GREEN_4(Colors.ESC + "[38;5;115m"),  // DarkSeaGreen3
    ALL_FONT_DARK_SLATE_GRAY_3(Colors.ESC + "[38;5;116m"),  // DarkSlateGray3
    ALL_FONT_SKY_BLUE_1(Colors.ESC + "[38;5;117m"),  // SkyBlue1
    ALL_FONT_CHARTREUSE_1(Colors.ESC + "[38;5;118m"),  // Chartreuse1
    ALL_FONT_LIGHT_GREEN_1(Colors.ESC + "[38;5;119m"),  // LightGreen
    ALL_FONT_LIGHT_GREEN_2(Colors.ESC + "[38;5;120m"),  // LightGreen
    ALL_FONT_PALE_GREEN_2(Colors.ESC + "[38;5;121m"),  // PaleGreen1
    ALL_FONT_AQUAMARINE_2(Colors.ESC + "[38;5;122m"),  // Aquamarine1
    ALL_FONT_DARK_SLATE_GRAY_1(Colors.ESC + "[38;5;123m"),  // DarkSlateGray1
    ALL_FONT_RED_3(Colors.ESC + "[38;5;124m"),  // Red3
    ALL_FONT_DEEP_PINK_6(Colors.ESC + "[38;5;125m"),  // DeepPink4
    ALL_FONT_MEDIUM_VIOLET_RED(Colors.ESC + "[38;5;126m"),  // MediumVioletRed
    ALL_FONT_MAGENTA_6(Colors.ESC + "[38;5;127m"),  // Magenta3
    ALL_FONT_DARK_VIOLET_2(Colors.ESC + "[38;5;128m"),  // DarkViolet
    ALL_FONT_PURPLE_1(Colors.ESC + "[38;5;129m"),  // Purple
    ALL_FONT_DARK_ORANGE_3(Colors.ESC + "[38;5;130m"),  // DarkOrange3
    ALL_FONT_INDIAN_RED_4(Colors.ESC + "[38;5;131m"),  // IndianRed
    ALL_FONT_HOT_PINK_5(Colors.ESC + "[38;5;132m"),  // HotPink3
    ALL_FONT_MEDIUM_ORCHID_3(Colors.ESC + "[38;5;133m"),  // MediumOrchid3
    ALL_FONT_MEDIUM_ORCHID_4(Colors.ESC + "[38;5;134m"),  // MediumOrchid
    ALL_FONT_MEDIUM_PURPLE_4(Colors.ESC + "[38;5;135m"),  // MediumPurple2
    ALL_FONT_DARK_GOLDENROD(Colors.ESC + "[38;5;136m"),  // DarkGoldenrod
    ALL_FONT_LIGHT_SALMON_3(Colors.ESC + "[38;5;137m"),  // LightSalmon3
    ALL_FONT_ROSY_BROWN(Colors.ESC + "[38;5;138m"),  // RosyBrown
    ALL_FONT_GREY_63(Colors.ESC + "[38;5;139m"),  // Grey63
    ALL_FONT_MEDIUM_PURPLE_3(Colors.ESC + "[38;5;140m"),  // MediumPurple2
    ALL_FONT_MEDIUM_PURPLE_1(Colors.ESC + "[38;5;141m"),  // MediumPurple1
    ALL_FONT_GOLD_3(Colors.ESC + "[38;5;142m"),  // Gold3
    ALL_FONT_DARK_KHAKI(Colors.ESC + "[38;5;143m"),  // DarkKhaki
    ALL_FONT_NAVAJO_WHITE_2(Colors.ESC + "[38;5;144m"),  // NavajoWhite3
    ALL_FONT_GREY_69(Colors.ESC + "[38;5;145m"),  // Grey69
    ALL_FONT_LIGHT_STEEL_BLUE_3(Colors.ESC + "[38;5;146m"),  // LightSteelBlue3
    ALL_FONT_LIGHT_STEEL_BLUE_2(Colors.ESC + "[38;5;147m"),  // LightSteelBlue
    ALL_FONT_YELLOW_4(Colors.ESC + "[38;5;148m"),  // Yellow3
    ALL_FONT_DARK_OLIVE_GREEN_5(Colors.ESC + "[38;5;149m"),  // DarkOliveGreen3
    ALL_FONT_DARK_SEA_GREEN_6(Colors.ESC + "[38;5;150m"),  // DarkSeaGreen3
    ALL_FONT_DARK_SEA_GREEN_7(Colors.ESC + "[38;5;151m"),  // DarkSeaGreen2
    ALL_FONT_LIGHT_CYAN_2(Colors.ESC + "[38;5;152m"),  // LightCyan3
    ALL_FONT_LIGHT_SKY_BLUE_1(Colors.ESC + "[38;5;153m"),  // LightSkyBlue1
    ALL_FONT_GREEN_YELLOW(Colors.ESC + "[38;5;154m"),  // GreenYellow
    ALL_FONT_DARK_OLIVE_GREEN_3(Colors.ESC + "[38;5;155m"),  // DarkOliveGreen2
    ALL_FONT_PALE_GREEN_1(Colors.ESC + "[38;5;156m"),  // PaleGreen1
    ALL_FONT_DARK_SEA_GREEN_3(Colors.ESC + "[38;5;157m"),  // DarkSeaGreen2
    ALL_FONT_DARK_SEA_GREEN_1(Colors.ESC + "[38;5;158m"),  // DarkSeaGreen1
    ALL_FONT_PALE_TURQUOISE_1(Colors.ESC + "[38;5;159m"),  // PaleTurquoise1
    ALL_FONT_RED_2(Colors.ESC + "[38;5;160m"),  // Red3
    ALL_FONT_DEEP_PINK_4(Colors.ESC + "[38;5;161m"),  // DeepPink3
    ALL_FONT_DEEP_PINK_2(Colors.ESC + "[38;5;162m"),  // DeepPink3
    ALL_FONT_MAGENTA_3(Colors.ESC + "[38;5;163m"),  // Magenta3
    ALL_FONT_MAGENTA_5(Colors.ESC + "[38;5;164m"),  // Magenta3
    ALL_FONT_MAGENTA_4(Colors.ESC + "[38;5;165m"),  // Magenta2
    ALL_FONT_DARK_ORANGE_2(Colors.ESC + "[38;5;166m"),  // DarkOrange3
    ALL_FONT_INDIAN_RED_3(Colors.ESC + "[38;5;167m"),  // IndianRed
    ALL_FONT_HOT_PINK_3(Colors.ESC + "[38;5;168m"),  // HotPink3
    ALL_FONT_HOT_PINK_4(Colors.ESC + "[38;5;169m"),  // HotPink2
    ALL_FONT_ORCHID_3(Colors.ESC + "[38;5;170m"),  // Orchid
    ALL_FONT_MEDIUM_ORCHID_1(Colors.ESC + "[38;5;171m"),  // MediumOrchid1
    ALL_FONT_ORANGE_2(Colors.ESC + "[38;5;172m"),  // Orange3
    ALL_FONT_LIGHT_SALMON_2(Colors.ESC + "[38;5;173m"),  // LightSalmon3
    ALL_FONT_LIGHT_PINK_2(Colors.ESC + "[38;5;174m"),  // LightPink3
    ALL_FONT_PINK_2(Colors.ESC + "[38;5;175m"),  // Pink3
    ALL_FONT_PLUM_3(Colors.ESC + "[38;5;176m"),  // Plum3
    ALL_FONT_VIOLET(Colors.ESC + "[38;5;177m"),  // Violet
    ALL_FONT_GOLD_2(Colors.ESC + "[38;5;178m"),  // Gold3
    ALL_FONT_LIGHT_GOLDENROD_2(Colors.ESC + "[38;5;179m"),  // LightGoldenrod3
    ALL_FONT_TAN(Colors.ESC + "[38;5;180m"),  // Tan
    ALL_FONT_MISTY_ROSE_2(Colors.ESC + "[38;5;181m"),  // MistyRose3
    ALL_FONT_THISTLE_2(Colors.ESC + "[38;5;182m"),  // Thistle3
    ALL_FONT_PLUM_2(Colors.ESC + "[38;5;183m"),  // Plum2
    ALL_FONT_YELLOW_3(Colors.ESC + "[38;5;184m"),  // Yellow3
    ALL_FONT_KHAKI_2(Colors.ESC + "[38;5;185m"),  // Khaki3
    ALL_FONT_LIGHT_GOLDENROD_5(Colors.ESC + "[38;5;186m"),  // LightGoldenrod2
    ALL_FONT_LIGHT_YELLOW_3(Colors.ESC + "[38;5;187m"),  // LightYellow3
    ALL_FONT_GREY_84(Colors.ESC + "[38;5;188m"),  // Grey84
    ALL_FONT_LIGHT_STEEL_BLUE_1(Colors.ESC + "[38;5;189m"),  // LightSteelBlue1
    ALL_FONT_YELLOW_2(Colors.ESC + "[38;5;190m"),  // Yellow2
    ALL_FONT_DARK_OLIVE_GREEN_2(Colors.ESC + "[38;5;191m"),  // DarkOliveGreen1
    ALL_FONT_DARK_OLIVE_GREEN_1(Colors.ESC + "[38;5;192m"),  // DarkOliveGreen1
    ALL_FONT_DARK_SEA_GREEN_2(Colors.ESC + "[38;5;193m"),  // DarkSeaGreen1
    ALL_FONT_HONEYDEW_2(Colors.ESC + "[38;5;194m"),  // Honeydew2
    ALL_FONT_LIGHT_CYAN_1(Colors.ESC + "[38;5;195m"),  // LightCyan1
    ALL_FONT_RED_1(Colors.ESC + "[38;5;196m"),  // Red1
    ALL_FONT_DEEP_PINK_3(Colors.ESC + "[38;5;197m"),  // DeepPink2
    ALL_FONT_DEEP_PINK_5(Colors.ESC + "[38;5;198m"),  // DeepPink1
    ALL_FONT_DEEP_PINK_1(Colors.ESC + "[38;5;199m"),  // DeepPink1
    ALL_FONT_MAGENTA_2(Colors.ESC + "[38;5;200m"),  // Magenta2
    ALL_FONT_MAGENTA_1(Colors.ESC + "[38;5;201m"),  // Magenta1
    ALL_FONT_ORANGE_RED_1(Colors.ESC + "[38;5;202m"),  // OrangeRed1
    ALL_FONT_INDIAN_RED_2(Colors.ESC + "[38;5;203m"),  // IndianRed1
    ALL_FONT_INDIAN_RED_1(Colors.ESC + "[38;5;204m"),  // IndianRed1
    ALL_FONT_HOT_PINK_2(Colors.ESC + "[38;5;205m"),  // HotPink
    ALL_FONT_HOT_PINK_1(Colors.ESC + "[38;5;206m"),  // HotPink
    ALL_FONT_MEDIUM_ORCHID_2(Colors.ESC + "[38;5;207m"),  // MediumOrchid1
    ALL_FONT_DARK_ORANGE_1(Colors.ESC + "[38;5;208m"),  // DarkOrange
    ALL_FONT_SALMON_1(Colors.ESC + "[38;5;209m"),  // Salmon1
    ALL_FONT_LIGHT_CORAL(Colors.ESC + "[38;5;210m"),  // LightCoral
    ALL_FONT_PALE_VIOLET_RED_1(Colors.ESC + "[38;5;211m"),  // PaleVioletRed1
    ALL_FONT_ORCHID_2(Colors.ESC + "[38;5;212m"),  // Orchid2
    ALL_FONT_ORCHID_1(Colors.ESC + "[38;5;213m"),  // Orchid1
    ALL_FONT_ORANGE_1(Colors.ESC + "[38;5;214m"),  // Orange1
    ALL_FONT_SANDY_BROWN(Colors.ESC + "[38;5;215m"),  // SandyBrown
    ALL_FONT_LIGHT_SALMON_1(Colors.ESC + "[38;5;216m"),  // LightSalmon1
    ALL_FONT_LIGHT_PINK_1(Colors.ESC + "[38;5;217m"),  // LightPink1
    ALL_FONT_PLUM_1(Colors.ESC + "[38;5;219m"),  // Plum1
    ALL_FONT_PINK_1(Colors.ESC + "[38;5;218m"),  // Pink1
    ALL_FONT_GOLD_1(Colors.ESC + "[38;5;220m"),  // Gold1
    ALL_FONT_LIGHT_GOLDENROD_4(Colors.ESC + "[38;5;221m"),  // LightGoldenrod2
    ALL_FONT_LIGHT_GOLDENROD_3(Colors.ESC + "[38;5;222m"),  // LightGoldenrod2
    ALL_FONT_NAVAJO_WHITE_1(Colors.ESC + "[38;5;223m"),  // NavajoWhite1
    ALL_FONT_MISTY_ROSE_1(Colors.ESC + "[38;5;224m"),  // MistyRose1
    ALL_FONT_THISTLE_1(Colors.ESC + "[38;5;225m"),  // Thistle1
    ALL_FONT_YELLOW_1(Colors.ESC + "[38;5;226m"),  // Yellow1
    ALL_FONT_LIGHT_GOLDENROD_1(Colors.ESC + "[38;5;227m"),  // LightGoldenrod1
    ALL_FONT_KHAKI_1(Colors.ESC + "[38;5;228m"),  // Khaki1
    ALL_FONT_WHEAT_1(Colors.ESC + "[38;5;229m"),  // Wheat1
    ALL_FONT_CORNSILK_1(Colors.ESC + "[38;5;230m"),  // Cornsilk1
    ALL_FONT_GREY_100(Colors.ESC + "[38;5;231m"),  // Grey100
    ALL_FONT_GREY_3(Colors.ESC + "[38;5;232m"),  // Grey3
    ALL_FONT_GREY_7(Colors.ESC + "[38;5;233m"),  // Grey7
    ALL_FONT_GREY_11(Colors.ESC + "[38;5;234m"),  // Grey11
    ALL_FONT_GREY_15(Colors.ESC + "[38;5;235m"),  // Grey15
    ALL_FONT_GREY_19(Colors.ESC + "[38;5;236m"),  // Grey19
    ALL_FONT_GREY_23(Colors.ESC + "[38;5;237m"),  // Grey23
    ALL_FONT_GREY_27(Colors.ESC + "[38;5;238m"),  // Grey27
    ALL_FONT_GREY_30(Colors.ESC + "[38;5;239m"),  // Grey30
    ALL_FONT_GREY_35(Colors.ESC + "[38;5;240m"),  // Grey35
    ALL_FONT_GREY_39(Colors.ESC + "[38;5;241m"),  // Grey39
    ALL_FONT_GREY_42(Colors.ESC + "[38;5;242m"),  // Grey42
    ALL_FONT_GREY_46(Colors.ESC + "[38;5;243m"),  // Grey46
    ALL_FONT_GREY_50(Colors.ESC + "[38;5;244m"),  // Grey50
    ALL_FONT_GREY_54(Colors.ESC + "[38;5;245m"),  // Grey54
    ALL_FONT_GREY_58(Colors.ESC + "[38;5;246m"),  // Grey58
    ALL_FONT_GREY_62(Colors.ESC + "[38;5;247m"),  // Grey62
    ALL_FONT_GREY_66(Colors.ESC + "[38;5;248m"),  // Grey66
    ALL_FONT_GREY_70(Colors.ESC + "[38;5;249m"),  // Grey70
    ALL_FONT_GREY_74(Colors.ESC + "[38;5;250m"),  // Grey74
    ALL_FONT_GREY_78(Colors.ESC + "[38;5;251m"),  // Grey78
    ALL_FONT_GREY_82(Colors.ESC + "[38;5;252m"),  // Grey82
    ALL_FONT_GREY_85(Colors.ESC + "[38;5;253m"),  // Grey85
    ALL_FONT_GREY_89(Colors.ESC + "[38;5;254m"),  // Grey89
    ALL_FONT_GREY_93(Colors.ESC + "[38;5;255m"),  // Grey93


    ALL_BACKGROUND_SYSTEM_BLACK(Colors.ESC + "[48;5;0m"),//SystemBlack
    ALL_BACKGROUND_SYSTEM_MAROON(Colors.ESC + "[48;5;1m"),//SystemMaroon
    ALL_BACKGROUND_SYSTEM_GREEN(Colors.ESC + "[48;5;2m"),//SystemGreen
    ALL_BACKGROUND_SYSTEM_OLIVE(Colors.ESC + "[48;5;3m"),//SystemOlive
    ALL_BACKGROUND_SYSTEM_NAVY(Colors.ESC + "[48;5;4m"),//SystemNavy
    ALL_BACKGROUND_SYSTEM_PURPLE(Colors.ESC + "[48;5;5m"),//SystemPurple
    ALL_BACKGROUND_SYSTEM_TEAL(Colors.ESC + "[48;5;6m"),//SystemTeal
    ALL_BACKGROUND_SYSTEM_SILVER(Colors.ESC + "[48;5;7m"),//SystemSilver
    ALL_BACKGROUND_SYSTEM_GREY(Colors.ESC + "[48;5;8m"),//SystemGrey
    ALL_BACKGROUND_SYSTEM_RED(Colors.ESC + "[48;5;9m"),//SystemRed
    ALL_BACKGROUND_SYSTEM_LIME(Colors.ESC + "[48;5;10m"),//SystemLime
    ALL_BACKGROUND_SYSTEM_YELLOW(Colors.ESC + "[48;5;11m"),//SystemYellow
    ALL_BACKGROUND_SYSTEM_BLUE(Colors.ESC + "[48;5;12m"),//SystemBlue
    ALL_BACKGROUND_SYSTEM_FUCHSIA(Colors.ESC + "[48;5;13m"),//SystemFuchsia
    ALL_BACKGROUND_SYSTEM_AQUA(Colors.ESC + "[48;5;14m"),//SystemAqua
    ALL_BACKGROUND_SYSTEM_WHITE(Colors.ESC + "[48;5;15m"),//SystemWhite
    ALL_BACKGROUND_GREY_0(Colors.ESC + "[48;5;16m"),//Grey0
    ALL_BACKGROUND_NAVY_BLUE(Colors.ESC + "[48;5;17m"),//NavyBlue
    ALL_BACKGROUND_DARK_BLUE(Colors.ESC + "[48;5;18m"),//DarkBlue
    ALL_BACKGROUND_BLUE_2(Colors.ESC + "[48;5;19m"),//Blue3
    ALL_BACKGROUND_BLUE_3(Colors.ESC + "[48;5;20m"),//Blue3
    ALL_BACKGROUND_BLUE_1(Colors.ESC + "[48;5;21m"),//Blue1
    ALL_BACKGROUND_DARK_GREEN(Colors.ESC + "[48;5;22m"),//DarkGreen
    ALL_BACKGROUND_DEEP_SKY_BLUE_7(Colors.ESC + "[48;5;23m"),//DeepSkyBlue4
    ALL_BACKGROUND_DEEP_SKY_BLUE_6(Colors.ESC + "[48;5;24m"),//DeepSkyBlue4
    ALL_BACKGROUND_DEEP_SKY_BLUE_5(Colors.ESC + "[48;5;25m"),//DeepSkyBlue4
    ALL_BACKGROUND_DODGER_BLUE_3(Colors.ESC + "[48;5;26m"),//DodgerBlue3
    ALL_BACKGROUND_DODGER_BLUE_2(Colors.ESC + "[48;5;27m"),//DodgerBlue2
    ALL_BACKGROUND_GREEN_4(Colors.ESC + "[48;5;28m"),//Green4
    ALL_BACKGROUND_SPRING_GREEN_6(Colors.ESC + "[48;5;29m"),//SpringGreen4
    ALL_BACKGROUND_TURQUOISE_2(Colors.ESC + "[48;5;30m"),//Turquoise4
    ALL_BACKGROUND_DEEP_SKY_BLUE_4(Colors.ESC + "[48;5;31m"),//DeepSkyBlue3
    ALL_BACKGROUND_DEEP_SKY_BLUE_3(Colors.ESC + "[48;5;32m"),//DeepSkyBlue3
    ALL_BACKGROUND_DODGER_BLUE_1(Colors.ESC + "[48;5;33m"),//DodgerBlue1
    ALL_BACKGROUND_GREEN_3(Colors.ESC + "[48;5;34m"),//Green3
    ALL_BACKGROUND_SPRING_GREEN_5(Colors.ESC + "[48;5;35m"),//SpringGreen3
    ALL_BACKGROUND_DARK_CYAN(Colors.ESC + "[48;5;36m"),//DarkCyan
    ALL_BACKGROUND_LIGHT_SEA_GREEN(Colors.ESC + "[48;5;37m"),//LightSeaGreen
    ALL_BACKGROUND_DEEP_SKY_BLUE_2(Colors.ESC + "[48;5;38m"),//DeepSkyBlue2
    ALL_BACKGROUND_DEEP_SKY_BLUE_1(Colors.ESC + "[48;5;39m"),//DeepSkyBlue1
    ALL_BACKGROUND_GREEN_2(Colors.ESC + "[48;5;40m"),//Green3
    ALL_BACKGROUND_SPRING_GREEN_2(Colors.ESC + "[48;5;41m"),//SpringGreen3
    ALL_BACKGROUND_SPRING_GREEN_4(Colors.ESC + "[48;5;42m"),//SpringGreen2
    ALL_BACKGROUND_CYAN_3(Colors.ESC + "[48;5;43m"),//Cyan3
    ALL_BACKGROUND_DARK_TURQUOISE(Colors.ESC + "[48;5;44m"),//DarkTurquoise
    ALL_BACKGROUND_TURQUOISE_1(Colors.ESC + "[48;5;45m"),//Turquoise2
    ALL_BACKGROUND_GREEN_1(Colors.ESC + "[48;5;46m"),//Green1
    ALL_BACKGROUND_SPRING_GREEN_1(Colors.ESC + "[48;5;47m"),//SpringGreen2
    ALL_BACKGROUND_SPRING_GREEN_3(Colors.ESC + "[48;5;48m"),//SpringGreen1
    ALL_BACKGROUND_MEDIUM_SPRING_GREEN(Colors.ESC + "[48;5;49m"),//MediumSpringGreen
    ALL_BACKGROUND_CYAN_2(Colors.ESC + "[48;5;50m"),//Cyan2
    ALL_BACKGROUND_CYAN_1(Colors.ESC + "[48;5;51m"),//Cyan1
    ALL_BACKGROUND_DARK_RED_2(Colors.ESC + "[48;5;52m"),//DarkRed
    ALL_BACKGROUND_DEEP_PINK_8(Colors.ESC + "[48;5;53m"),//DeepPink4
    ALL_BACKGROUND_PURPLE_5(Colors.ESC + "[48;5;54m"),//Purple4
    ALL_BACKGROUND_PURPLE_4(Colors.ESC + "[48;5;55m"),//Purple4
    ALL_BACKGROUND_PURPLE_3(Colors.ESC + "[48;5;56m"),//Purple3
    ALL_BACKGROUND_BLUE_VIOLET(Colors.ESC + "[48;5;57m"),//BlueViolet
    ALL_BACKGROUND_ORANGE_4(Colors.ESC + "[48;5;58m"),//Orange4
    ALL_BACKGROUND_GREY_37(Colors.ESC + "[48;5;59m"),//Grey37
    ALL_BACKGROUND_MEDIUM_PURPLE_7(Colors.ESC + "[48;5;60m"),//MediumPurple4
    ALL_BACKGROUND_SLATE_BLUE_3(Colors.ESC + "[48;5;61m"),//SlateBlue3
    ALL_BACKGROUND_SLATE_BLUE_2(Colors.ESC + "[48;5;62m"),//SlateBlue3
    ALL_BACKGROUND_ROYAL_BLUE_1(Colors.ESC + "[48;5;63m"),//RoyalBlue1
    ALL_BACKGROUND_CHARTREUSE_6(Colors.ESC + "[48;5;64m"),//Chartreuse4
    ALL_BACKGROUND_DARK_SEA_GREEN_9(Colors.ESC + "[48;5;65m"),//DarkSeaGreen4
    ALL_BACKGROUND_PALE_TURQUOISE_2(Colors.ESC + "[48;5;66m"),//PaleTurquoise4
    ALL_BACKGROUND_STEEL_BLUE_4(Colors.ESC + "[48;5;67m"),//SteelBlue
    ALL_BACKGROUND_STEEL_BLUE_3(Colors.ESC + "[48;5;68m"),//SteelBlue3
    ALL_BACKGROUND_CORNFLOWER_BLUE(Colors.ESC + "[48;5;69m"),//CornflowerBlue
    ALL_BACKGROUND_CHARTREUSE_5(Colors.ESC + "[48;5;70m"),//Chartreuse3
    ALL_BACKGROUND_DARK_SEA_GREEN_5(Colors.ESC + "[48;5;71m"),//DarkSeaGreen4
    ALL_BACKGROUND_CADET_BLUE_1(Colors.ESC + "[48;5;72m"),//CadetBlue
    ALL_BACKGROUND_CADET_BLUE_2(Colors.ESC + "[48;5;73m"),//CadetBlue
    ALL_BACKGROUND_SKY_BLUE_3(Colors.ESC + "[48;5;74m"),//SkyBlue3
    ALL_BACKGROUND_STEEL_BLUE_2(Colors.ESC + "[48;5;75m"),//SteelBlue1
    ALL_BACKGROUND_CHARTREUSE_3(Colors.ESC + "[48;5;76m"),//Chartreuse3
    ALL_BACKGROUND_PALE_GREEN_3(Colors.ESC + "[48;5;77m"),//PaleGreen3
    ALL_BACKGROUND_SEA_GREEN_3(Colors.ESC + "[48;5;78m"),//SeaGreen3
    ALL_BACKGROUND_AQUAMARINE_3(Colors.ESC + "[48;5;79m"),//Aquamarine3
    ALL_BACKGROUND_MEDIUM_TURQUOISE(Colors.ESC + "[48;5;80m"),//MediumTurquoise
    ALL_BACKGROUND_STEEL_BLUE_1(Colors.ESC + "[48;5;81m"),//SteelBlue1
    ALL_BACKGROUND_CHARTREUSE_2(Colors.ESC + "[48;5;82m"),//Chartreuse2
    ALL_BACKGROUND_SEA_GREEN_2(Colors.ESC + "[48;5;83m"),//SeaGreen2
    ALL_BACKGROUND_SEA_GREEN_1(Colors.ESC + "[48;5;84m"),//SeaGreen1
    ALL_BACKGROUND_SEA_GREEN_4(Colors.ESC + "[48;5;85m"),//SeaGreen1
    ALL_BACKGROUND_AQUAMARINE_1(Colors.ESC + "[48;5;86m"),//Aquamarine1
    ALL_BACKGROUND_DARK_SLATE_GRAY_2(Colors.ESC + "[48;5;87m"),//DarkSlateGray2
    ALL_BACKGROUND_DARK_RED_1(Colors.ESC + "[48;5;88m"),//DarkRed
    ALL_BACKGROUND_DEEP_PINK_7(Colors.ESC + "[48;5;89m"),//DeepPink4
    ALL_BACKGROUND_DARK_MAGENTA_1(Colors.ESC + "[48;5;90m"),//DarkMagenta
    ALL_BACKGROUND_DARK_MAGENTA_2(Colors.ESC + "[48;5;91m"),//DarkMagenta
    ALL_BACKGROUND_DARK_VIOLET_1(Colors.ESC + "[48;5;92m"),//DarkViolet
    ALL_BACKGROUND_PURPLE_2(Colors.ESC + "[48;5;93m"),//Purple
    ALL_BACKGROUND_ORANGE_3(Colors.ESC + "[48;5;94m"),//Orange4
    ALL_BACKGROUND_LIGHT_PINK_3(Colors.ESC + "[48;5;95m"),//LightPink4
    ALL_BACKGROUND_PLUM_4(Colors.ESC + "[48;5;96m"),//Plum4
    ALL_BACKGROUND_MEDIUM_PURPLE_6(Colors.ESC + "[48;5;97m"),//MediumPurple3
    ALL_BACKGROUND_MEDIUM_PURPLE_5(Colors.ESC + "[48;5;98m"),//MediumPurple3
    ALL_BACKGROUND_SLATE_BLUE_1(Colors.ESC + "[48;5;99m"),//SlateBlue1
    ALL_BACKGROUND_YELLOW_6(Colors.ESC + "[48;5;100m"),//Yellow4
    ALL_BACKGROUND_WHEAT_4(Colors.ESC + "[48;5;101m"),//Wheat4
    ALL_BACKGROUND_GREY_53(Colors.ESC + "[48;5;102m"),//Grey53
    ALL_BACKGROUND_LIGHT_SLATE_GREY(Colors.ESC + "[48;5;103m"),//LightSlateGrey
    ALL_BACKGROUND_MEDIUM_PURPLE_2(Colors.ESC + "[48;5;104m"),//MediumPurple
    ALL_BACKGROUND_LIGHT_SLATE_BLUE(Colors.ESC + "[48;5;105m"),//LightSlateBlue
    ALL_BACKGROUND_YELLOW_5(Colors.ESC + "[48;5;106m"),//Yellow4
    ALL_BACKGROUND_DARK_OLIVE_GREEN_6(Colors.ESC + "[48;5;107m"),//DarkOliveGreen3
    ALL_BACKGROUND_DARK_SEA_GREEN_8(Colors.ESC + "[48;5;108m"),//DarkSeaGreen
    ALL_BACKGROUND_LIGHT_SKY_BLUE_2(Colors.ESC + "[48;5;109m"),//LightSkyBlue3
    ALL_BACKGROUND_LIGHT_SKY_BLUE_3(Colors.ESC + "[48;5;110m"),//LightSkyBlue3
    ALL_BACKGROUND_SKY_BLUE_2(Colors.ESC + "[48;5;111m"),//SkyBlue2
    ALL_BACKGROUND_CHARTREUSE_4(Colors.ESC + "[48;5;112m"),//Chartreuse2
    ALL_BACKGROUND_DARK_OLIVE_GREEN_4(Colors.ESC + "[48;5;113m"),//DarkOliveGreen3
    ALL_BACKGROUND_PALE_GREEN_4(Colors.ESC + "[48;5;114m"),//PaleGreen3
    ALL_BACKGROUND_DARK_SEA_GREEN_4(Colors.ESC + "[48;5;115m"),//DarkSeaGreen3
    ALL_BACKGROUND_DARK_SLATE_GRAY_3(Colors.ESC + "[48;5;116m"),//DarkSlateGray3
    ALL_BACKGROUND_SKY_BLUE_1(Colors.ESC + "[48;5;117m"),//SkyBlue1
    ALL_BACKGROUND_CHARTREUSE_1(Colors.ESC + "[48;5;118m"),//Chartreuse1
    ALL_BACKGROUND_LIGHT_GREEN_1(Colors.ESC + "[48;5;119m"),//LightGreen
    ALL_BACKGROUND_LIGHT_GREEN_2(Colors.ESC + "[48;5;120m"),//LightGreen
    ALL_BACKGROUND_PALE_GREEN_2(Colors.ESC + "[48;5;121m"),//PaleGreen1
    ALL_BACKGROUND_AQUAMARINE_2(Colors.ESC + "[48;5;122m"),//Aquamarine1
    ALL_BACKGROUND_DARK_SLATE_GRAY_1(Colors.ESC + "[48;5;123m"),//DarkSlateGray1
    ALL_BACKGROUND_RED_3(Colors.ESC + "[48;5;124m"),//Red3
    ALL_BACKGROUND_DEEP_PINK_6(Colors.ESC + "[48;5;125m"),//DeepPink4
    ALL_BACKGROUND_MEDIUM_VIOLET_RED(Colors.ESC + "[48;5;126m"),//MediumVioletRed
    ALL_BACKGROUND_MAGENTA_6(Colors.ESC + "[48;5;127m"),//Magenta3
    ALL_BACKGROUND_DARK_VIOLET_2(Colors.ESC + "[48;5;128m"),//DarkViolet
    ALL_BACKGROUND_PURPLE_1(Colors.ESC + "[48;5;129m"),//Purple
    ALL_BACKGROUND_DARK_ORANGE_3(Colors.ESC + "[48;5;130m"),//DarkOrange3
    ALL_BACKGROUND_INDIAN_RED_4(Colors.ESC + "[48;5;131m"),//IndianRed
    ALL_BACKGROUND_HOT_PINK_5(Colors.ESC + "[48;5;132m"),//HotPink3
    ALL_BACKGROUND_MEDIUM_ORCHID_3(Colors.ESC + "[48;5;133m"),//MediumOrchid3
    ALL_BACKGROUND_MEDIUM_ORCHID_4(Colors.ESC + "[48;5;134m"),//MediumOrchid
    ALL_BACKGROUND_MEDIUM_PURPLE_4(Colors.ESC + "[48;5;135m"),//MediumPurple2
    ALL_BACKGROUND_DARK_GOLDENROD(Colors.ESC + "[48;5;136m"),//DarkGoldenrod
    ALL_BACKGROUND_LIGHT_SALMON_3(Colors.ESC + "[48;5;137m"),//LightSalmon3
    ALL_BACKGROUND_ROSY_BROWN(Colors.ESC + "[48;5;138m"),//RosyBrown
    ALL_BACKGROUND_GREY_63(Colors.ESC + "[48;5;139m"),//Grey63
    ALL_BACKGROUND_MEDIUM_PURPLE_3(Colors.ESC + "[48;5;140m"),//MediumPurple2
    ALL_BACKGROUND_MEDIUM_PURPLE_1(Colors.ESC + "[48;5;141m"),//MediumPurple1
    ALL_BACKGROUND_GOLD_3(Colors.ESC + "[48;5;142m"),//Gold3
    ALL_BACKGROUND_DARK_KHAKI(Colors.ESC + "[48;5;143m"),//DarkKhaki
    ALL_BACKGROUND_NAVAJO_WHITE_2(Colors.ESC + "[48;5;144m"),//NavajoWhite3
    ALL_BACKGROUND_GREY_69(Colors.ESC + "[48;5;145m"),//Grey69
    ALL_BACKGROUND_LIGHT_STEEL_BLUE_3(Colors.ESC + "[48;5;146m"),//LightSteelBlue3
    ALL_BACKGROUND_LIGHT_STEEL_BLUE_2(Colors.ESC + "[48;5;147m"),//LightSteelBlue
    ALL_BACKGROUND_YELLOW_4(Colors.ESC + "[48;5;148m"),//Yellow3
    ALL_BACKGROUND_DARK_OLIVE_GREEN_5(Colors.ESC + "[48;5;149m"),//DarkOliveGreen3
    ALL_BACKGROUND_DARK_SEA_GREEN_6(Colors.ESC + "[48;5;150m"),//DarkSeaGreen3
    ALL_BACKGROUND_DARK_SEA_GREEN_7(Colors.ESC + "[48;5;151m"),//DarkSeaGreen2
    ALL_BACKGROUND_LIGHT_CYAN_2(Colors.ESC + "[48;5;152m"),//LightCyan3
    ALL_BACKGROUND_LIGHT_SKY_BLUE_1(Colors.ESC + "[48;5;153m"),//LightSkyBlue1
    ALL_BACKGROUND_GREEN_YELLOW(Colors.ESC + "[48;5;154m"),//GreenYellow
    ALL_BACKGROUND_DARK_OLIVE_GREEN_3(Colors.ESC + "[48;5;155m"),//DarkOliveGreen2
    ALL_BACKGROUND_PALE_GREEN_1(Colors.ESC + "[48;5;156m"),//PaleGreen1
    ALL_BACKGROUND_DARK_SEA_GREEN_3(Colors.ESC + "[48;5;157m"),//DarkSeaGreen2
    ALL_BACKGROUND_DARK_SEA_GREEN_1(Colors.ESC + "[48;5;158m"),//DarkSeaGreen1
    ALL_BACKGROUND_PALE_TURQUOISE_1(Colors.ESC + "[48;5;159m"),//PaleTurquoise1
    ALL_BACKGROUND_RED_2(Colors.ESC + "[48;5;160m"),//Red3
    ALL_BACKGROUND_DEEP_PINK_4(Colors.ESC + "[48;5;161m"),//DeepPink3
    ALL_BACKGROUND_DEEP_PINK_2(Colors.ESC + "[48;5;162m"),//DeepPink3
    ALL_BACKGROUND_MAGENTA_3(Colors.ESC + "[48;5;163m"),//Magenta3
    ALL_BACKGROUND_MAGENTA_5(Colors.ESC + "[48;5;164m"),//Magenta3
    ALL_BACKGROUND_MAGENTA_4(Colors.ESC + "[48;5;165m"),//Magenta2
    ALL_BACKGROUND_DARK_ORANGE_2(Colors.ESC + "[48;5;166m"),//DarkOrange3
    ALL_BACKGROUND_INDIAN_RED_3(Colors.ESC + "[48;5;167m"),//IndianRed
    ALL_BACKGROUND_HOT_PINK_3(Colors.ESC + "[48;5;168m"),//HotPink3
    ALL_BACKGROUND_HOT_PINK_4(Colors.ESC + "[48;5;169m"),//HotPink2
    ALL_BACKGROUND_ORCHID_3(Colors.ESC + "[48;5;170m"),//Orchid
    ALL_BACKGROUND_MEDIUM_ORCHID_1(Colors.ESC + "[48;5;171m"),//MediumOrchid1
    ALL_BACKGROUND_ORANGE_2(Colors.ESC + "[48;5;172m"),//Orange3
    ALL_BACKGROUND_LIGHT_SALMON_2(Colors.ESC + "[48;5;173m"),//LightSalmon3
    ALL_BACKGROUND_LIGHT_PINK_2(Colors.ESC + "[48;5;174m"),//LightPink3
    ALL_BACKGROUND_PINK_2(Colors.ESC + "[48;5;175m"),//Pink3
    ALL_BACKGROUND_PLUM_3(Colors.ESC + "[48;5;176m"),//Plum3
    ALL_BACKGROUND_VIOLET(Colors.ESC + "[48;5;177m"),//Violet
    ALL_BACKGROUND_GOLD_2(Colors.ESC + "[48;5;178m"),//Gold3
    ALL_BACKGROUND_LIGHT_GOLDENROD_4(Colors.ESC + "[48;5;179m"),//LightGoldenrod3
    ALL_BACKGROUND_TAN(Colors.ESC + "[48;5;180m"),//Tan
    ALL_BACKGROUND_MISTY_ROSE_2(Colors.ESC + "[48;5;181m"),//MistyRose3
    ALL_BACKGROUND_THISTLE_2(Colors.ESC + "[48;5;182m"),//Thistle3
    ALL_BACKGROUND_PLUM_2(Colors.ESC + "[48;5;183m"),//Plum2
    ALL_BACKGROUND_YELLOW_3(Colors.ESC + "[48;5;184m"),//Yellow3
    ALL_BACKGROUND_KHAKI_2(Colors.ESC + "[48;5;185m"),//Khaki3
    ALL_BACKGROUND_LIGHT_GOLDENROD_5(Colors.ESC + "[48;5;186m"),//LightGoldenrod2
    ALL_BACKGROUND_LIGHT_YELLOW_3(Colors.ESC + "[48;5;187m"),//LightYellow3
    ALL_BACKGROUND_GREY_84(Colors.ESC + "[48;5;188m"),//Grey84
    ALL_BACKGROUND_LIGHT_STEEL_BLUE_1(Colors.ESC + "[48;5;189m"),//LightSteelBlue1
    ALL_BACKGROUND_YELLOW_2(Colors.ESC + "[48;5;190m"),//Yellow2
    ALL_BACKGROUND_DARK_OLIVE_GREEN_2(Colors.ESC + "[48;5;191m"),//DarkOliveGreen1
    ALL_BACKGROUND_DARK_OLIVE_GREEN_1(Colors.ESC + "[48;5;192m"),//DarkOliveGreen1
    ALL_BACKGROUND_DARK_SEA_GREEN_2(Colors.ESC + "[48;5;193m"),//DarkSeaGreen1
    ALL_BACKGROUND_HONEYDEW_2(Colors.ESC + "[48;5;194m"),//Honeydew2
    ALL_BACKGROUND_LIGHT_CYAN_1(Colors.ESC + "[48;5;195m"),//LightCyan1
    ALL_BACKGROUND_RED_1(Colors.ESC + "[48;5;196m"),//Red1
    ALL_BACKGROUND_DEEP_PINK_3(Colors.ESC + "[48;5;197m"),//DeepPink2
    ALL_BACKGROUND_DEEP_PINK_5(Colors.ESC + "[48;5;198m"),//DeepPink1
    ALL_BACKGROUND_DEEP_PINK_1(Colors.ESC + "[48;5;199m"),//DeepPink1
    ALL_BACKGROUND_MAGENTA_2(Colors.ESC + "[48;5;200m"),//Magenta2
    ALL_BACKGROUND_MAGENTA_1(Colors.ESC + "[48;5;201m"),//Magenta1
    ALL_BACKGROUND_ORANGE_RED_1(Colors.ESC + "[48;5;202m"),//OrangeRed1
    ALL_BACKGROUND_INDIAN_RED_2(Colors.ESC + "[48;5;203m"),//IndianRed1
    ALL_BACKGROUND_INDIAN_RED_1(Colors.ESC + "[48;5;204m"),//IndianRed1
    ALL_BACKGROUND_HOT_PINK_2(Colors.ESC + "[48;5;205m"),//HotPink
    ALL_BACKGROUND_HOT_PINK_1(Colors.ESC + "[48;5;206m"),//HotPink
    ALL_BACKGROUND_MEDIUM_ORCHID_2(Colors.ESC + "[48;5;207m"),//MediumOrchid1
    ALL_BACKGROUND_DARK_ORANGE_1(Colors.ESC + "[48;5;208m"),//DarkOrange
    ALL_BACKGROUND_SALMON_1(Colors.ESC + "[48;5;209m"),//Salmon1
    ALL_BACKGROUND_LIGHT_CORAL(Colors.ESC + "[48;5;210m"),//LightCoral
    ALL_BACKGROUND_PALE_VIOLET_RED_1(Colors.ESC + "[48;5;211m"),//PaleVioletRed1
    ALL_BACKGROUND_ORCHID_2(Colors.ESC + "[48;5;212m"),//Orchid2
    ALL_BACKGROUND_ORCHID_1(Colors.ESC + "[48;5;213m"),//Orchid1
    ALL_BACKGROUND_ORANGE_1(Colors.ESC + "[48;5;214m"),//Orange1
    ALL_BACKGROUND_SANDY_BROWN(Colors.ESC + "[48;5;215m"),//SandyBrown
    ALL_BACKGROUND_LIGHT_SALMON_1(Colors.ESC + "[48;5;216m"),//LightSalmon1
    ALL_BACKGROUND_LIGHT_PINK_1(Colors.ESC + "[48;5;217m"),//LightPink1
    ALL_BACKGROUND_PLUM_1(Colors.ESC + "[48;5;219m"),//Plum1
    ALL_BACKGROUND_PINK_1(Colors.ESC + "[48;5;218m"),//Pink1
    ALL_BACKGROUND_GOLD_1(Colors.ESC + "[48;5;220m"),//Gold1
    ALL_BACKGROUND_LIGHT_GOLDENROD_3(Colors.ESC + "[48;5;221m"),//LightGoldenrod2
    ALL_BACKGROUND_LIGHT_GOLDENROD_2(Colors.ESC + "[48;5;222m"),//LightGoldenrod2
    ALL_BACKGROUND_NAVAJO_WHITE_1(Colors.ESC + "[48;5;223m"),//NavajoWhite1
    ALL_BACKGROUND_MISTY_ROSE_1(Colors.ESC + "[48;5;224m"),//MistyRose1
    ALL_BACKGROUND_THISTLE_1(Colors.ESC + "[48;5;225m"),//Thistle1
    ALL_BACKGROUND_YELLOW_1(Colors.ESC + "[48;5;226m"),//Yellow1
    ALL_BACKGROUND_LIGHT_GOLDENROD_1(Colors.ESC + "[48;5;227m"),//LightGoldenrod1
    ALL_BACKGROUND_KHAKI_1(Colors.ESC + "[48;5;228m"),//Khaki1
    ALL_BACKGROUND_WHEAT_1(Colors.ESC + "[48;5;229m"),//Wheat1
    ALL_BACKGROUND_CORNSILK_1(Colors.ESC + "[48;5;230m"),//Cornsilk1
    ALL_BACKGROUND_GREY_100(Colors.ESC + "[48;5;231m"),//Grey100
    ALL_BACKGROUND_GREY_3(Colors.ESC + "[48;5;232m"),//Grey3
    ALL_BACKGROUND_GREY_7(Colors.ESC + "[48;5;233m"),//Grey7
    ALL_BACKGROUND_GREY_11(Colors.ESC + "[48;5;234m"),//Grey11
    ALL_BACKGROUND_GREY_15(Colors.ESC + "[48;5;235m"),//Grey15
    ALL_BACKGROUND_GREY_19(Colors.ESC + "[48;5;236m"),//Grey19
    ALL_BACKGROUND_GREY_23(Colors.ESC + "[48;5;237m"),//Grey23
    ALL_BACKGROUND_GREY_27(Colors.ESC + "[48;5;238m"),//Grey27
    ALL_BACKGROUND_GREY_30(Colors.ESC + "[48;5;239m"),//Grey30
    ALL_BACKGROUND_GREY_35(Colors.ESC + "[48;5;240m"),//Grey35
    ALL_BACKGROUND_GREY_39(Colors.ESC + "[48;5;241m"),//Grey39
    ALL_BACKGROUND_GREY_42(Colors.ESC + "[48;5;242m"),//Grey42
    ALL_BACKGROUND_GREY_46(Colors.ESC + "[48;5;243m"),//Grey46
    ALL_BACKGROUND_GREY_50(Colors.ESC + "[48;5;244m"),//Grey50
    ALL_BACKGROUND_GREY_54(Colors.ESC + "[48;5;245m"),//Grey54
    ALL_BACKGROUND_GREY_58(Colors.ESC + "[48;5;246m"),//Grey58
    ALL_BACKGROUND_GREY_62(Colors.ESC + "[48;5;247m"),//Grey62
    ALL_BACKGROUND_GREY_66(Colors.ESC + "[48;5;248m"),//Grey66
    ALL_BACKGROUND_GREY_70(Colors.ESC + "[48;5;249m"),//Grey70
    ALL_BACKGROUND_GREY_74(Colors.ESC + "[48;5;250m"),//Grey74
    ALL_BACKGROUND_GREY_78(Colors.ESC + "[48;5;251m"),//Grey78
    ALL_BACKGROUND_GREY_82(Colors.ESC + "[48;5;252m"),//Grey82
    ALL_BACKGROUND_GREY_85(Colors.ESC + "[48;5;253m"),//Grey85
    ALL_BACKGROUND_GREY_89(Colors.ESC + "[48;5;254m"),//Grey89
    ALL_BACKGROUND_GREY_93(Colors.ESC + "[48;5;255m");//Grey93

    private final String value;

    private static final char ESC = '\033';

    Colors(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    private static final int[] width = {40};


    public static void printRegularColors() {
        System.out.println("  " + REGULAR_FONT_BLACK + "### REGULAR_FONT_BLACK               ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_RED + "### REGULAR_FONT_RED                 ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_GREEN + "### REGULAR_FONT_GREEN               ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_YELLOW + "### REGULAR_FONT_YELLOW              ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_BLUE + "### REGULAR_FONT_BLUE                ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_PURPLE + "### REGULAR_FONT_PURPLE              ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_CYAN + "### REGULAR_FONT_CYAN                ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_WHITE + "### REGULAR_FONT_WHITE               ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_BLACK + "### REGULAR_BACKGROUND_BLACK         ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_RED + "### REGULAR_BACKGROUND_RED           ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_GREEN + "### REGULAR_BACKGROUND_GREEN         ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_YELLOW + "### REGULAR_BACKGROUND_YELLOW        ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_BLUE + "### REGULAR_BACKGROUND_BLUE          ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_PURPLE + "### REGULAR_BACKGROUND_PURPLE        ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_CYAN + "### REGULAR_BACKGROUND_CYAN          ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_WHITE + "### REGULAR_BACKGROUND_WHITE         ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_BLACK_BRIGHT + "### REGULAR_FONT_BLACK_BRIGHT        ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_RED_BRIGHT + "### REGULAR_FONT_RED_BRIGHT          ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_GREEN_BRIGHT + "### REGULAR_FONT_GREEN_BRIGHT        ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_YELLOW_BRIGHT + "### REGULAR_FONT_YELLOW_BRIGHT       ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_BLUE_BRIGHT + "### REGULAR_FONT_BLUE_BRIGHT         ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_PURPLE_BRIGHT + "### REGULAR_FONT_PURPLE_BRIGHT       ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_CYAN_BRIGHT + "### REGULAR_FONT_CYAN_BRIGHT         ###" + RESET + " ");
        System.out.println("  " + REGULAR_FONT_WHITE_BRIGHT + "### REGULAR_FONT_WHITE_BRIGHT        ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_BLACK_BRIGHT + "### REGULAR_BACKGROUND_BLACK_BRIGHT  ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_RED_BRIGHT + "### REGULAR_BACKGROUND_RED_BRIGHT    ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_GREEN_BRIGHT + "### REGULAR_BACKGROUND_GREEN_BRIGHT  ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_YELLOW_BRIGHT + "### REGULAR_BACKGROUND_YELLOW_BRIGHT ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_BLUE_BRIGHT + "### REGULAR_BACKGROUND_BLUE_BRIGHT   ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_PURPLE_BRIGHT + "### REGULAR_BACKGROUND_PURPLE_BRIGHT ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_CYAN_BRIGHT + "### REGULAR_BACKGROUND_CYAN_BRIGHT   ###" + RESET + " ");
        System.out.println("  " + REGULAR_BACKGROUND_WHITE_BRIGHT + "### REGULAR_BACKGROUND_WHITE_BRIGHT  ###" + RESET + " ");
    }


    public static void printSystemFont() {
        System.out.println("  " + ALL_FONT_SYSTEM_BLACK + "### ALL SYSTEM BLACK ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_MAROON + "### ALL SYSTEM MAROON ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_GREEN + "### ALL SYSTEM GREEN ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_OLIVE + "### ALL SYSTEM OLIVE ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_NAVY + "### ALL SYSTEM NAVY ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_PURPLE + "### ALL SYSTEM PURPLE ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_TEAL + "### ALL SYSTEM TEAL ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_SILVER + "### ALL SYSTEM SILVER ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_GREY + "### ALL SYSTEM GREY ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_RED + "### ALL SYSTEM RED ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_LIME + "### ALL SYSTEM LIME ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_YELLOW + "### ALL SYSTEM YELLOW ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_BLUE + "### ALL SYSTEM BLUE ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_FUCHSIA + "### ALL SYSTEM FUCHSIA ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_AQUA + "### ALL SYSTEM AQUA ###" + RESET + " ");
        System.out.println("  " + ALL_FONT_SYSTEM_WHITE + "### ALL SYSTEM WHITE ###" + RESET + " ");
    }


    public static void printGreyFont() {
        System.out.println("  " + ALL_FONT_GREY_0 + "### ALL GREY 0 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_3 + "### ALL GREY 3 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_7 + "### ALL GREY 7 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_11 + "### ALL GREY 11 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_15 + "### ALL GREY 15 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_19 + "### ALL GREY 19 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_23 + "### ALL GREY 23 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_27 + "### ALL GREY 27 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_30 + "### ALL GREY 30 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_35 + "### ALL GREY 35 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_37 + "### ALL GREY 37 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_39 + "### ALL GREY 39 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_42 + "### ALL GREY 42 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_46 + "### ALL GREY 46 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_50 + "### ALL GREY 50 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_53 + "### ALL GREY 53 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_54 + "### ALL GREY 54 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_58 + "### ALL GREY 58 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_62 + "### ALL GREY 62 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_63 + "### ALL GREY 63 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_66 + "### ALL GREY 66 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_69 + "### ALL GREY 69 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_70 + "### ALL GREY 70 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_74 + "### ALL GREY 74 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_78 + "### ALL GREY 78 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_82 + "### ALL GREY 82 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_84 + "### ALL GREY 84 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_85 + "### ALL GREY 85 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_89 + "### ALL GREY 89 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_93 + "### ALL GREY 93 ###" + RESET);
        System.out.println("  " + ALL_FONT_GREY_100 + "### ALL GREY 100###" + RESET);

    }


    public static void printGreyFontCompact() {
        System.out.println("  GREY (Compact test, for more, run testGreyFont())");
        System.out.print("  " + ALL_FONT_GREY_0 + "#00#" + RESET + ALL_FONT_GREY_3 + "#03#" + RESET + ALL_FONT_GREY_7 + "#07#" + RESET + ALL_FONT_GREY_11 + "#11#" + RESET + ALL_FONT_GREY_15 + "#15#" + RESET + ALL_FONT_GREY_19 + "#19#" + RESET + ALL_FONT_GREY_23 + "#23#" + RESET + ALL_FONT_GREY_27 + "#27#" + RESET + ALL_FONT_GREY_30 + "#30#" + RESET + ALL_FONT_GREY_35 + "#35#" + RESET + ALL_FONT_GREY_37 + "#37#" + RESET + ALL_FONT_GREY_39 + "#39#" + RESET + ALL_FONT_GREY_42 + "#42#" + RESET + ALL_FONT_GREY_46 + "#46#" + RESET + ALL_FONT_GREY_50 + "#50#" + RESET + ALL_FONT_GREY_53 + "#53#" + RESET + ALL_FONT_GREY_54 + "#54#" + RESET + ALL_FONT_GREY_58 + "#58#" + RESET + ALL_FONT_GREY_62 + "#62#" + RESET + ALL_FONT_GREY_63 + "#63#" + RESET + ALL_FONT_GREY_66 + "#66#" + RESET + ALL_FONT_GREY_69 + "#69#" + RESET + ALL_FONT_GREY_70 + "#70#" + RESET + ALL_FONT_GREY_74 + "#74#" + RESET + ALL_FONT_GREY_78 + "#78#" + RESET + ALL_FONT_GREY_82 + "#82#" + RESET + ALL_FONT_GREY_84 + "#84#" + RESET + ALL_FONT_GREY_85 + "#85#" + RESET + ALL_FONT_GREY_89 + "#89#" + RESET + ALL_FONT_GREY_93 + "#93#" + RESET + ALL_FONT_GREY_100 + "#100#" + RESET);
    }


    public static void printALLFont() {
        // ALL_FONT_NAVY_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_NAVY_BLUE") + "   " + ALL_FONT_NAVY_BLUE + "###" + RESET);
        // ALL_FONT_DARK_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_BLUE") + "   " + ALL_FONT_DARK_BLUE + "###" + RESET);
        // ALL_FONT_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_BLUE") + "   " + ALL_FONT_BLUE_1 + "#1#" + RESET + ALL_FONT_BLUE_2 + "#2#" + RESET + ALL_FONT_BLUE_3 + "#3#" + RESET);
        // ALL_FONT_GREEN 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_GREEN") + "   " + ALL_FONT_GREEN_1 + "#1#" + RESET + ALL_FONT_GREEN_2 + "#2#" + RESET + ALL_FONT_GREEN_3 + "#3#" + RESET + ALL_FONT_GREEN_4 + "#4#" + RESET);
        // ALL_FONT_DEEP_SKY_BLUE 1 2 3 4 5 6 7
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DEEP_SKY_BLUE") + "   " + ALL_FONT_DEEP_SKY_BLUE_1 + "#1#" + RESET + ALL_FONT_DEEP_SKY_BLUE_2 + "#2#" + RESET + ALL_FONT_DEEP_SKY_BLUE_3 + "#3#" + RESET + ALL_FONT_DEEP_SKY_BLUE_4 + "#4#" + RESET + ALL_FONT_DEEP_SKY_BLUE_5 + "#5#" + RESET + ALL_FONT_DEEP_SKY_BLUE_6 + "#6#" + RESET + ALL_FONT_DEEP_SKY_BLUE_7 + "#7#" + RESET);
        // ALL_FONT_DODGER_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DODGER_BLUE") + "   " + ALL_FONT_DODGER_BLUE_1 + "#1#" + RESET + ALL_FONT_DODGER_BLUE_2 + "#2#" + RESET + ALL_FONT_DODGER_BLUE_3 + "#3#" + RESET);
        // ALL_FONT_SPRING_GREEN 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_SPRING_GREEN") + "   " + ALL_FONT_SPRING_GREEN_1 + "#1#" + RESET + ALL_FONT_SPRING_GREEN_2 + "#2#" + RESET + ALL_FONT_SPRING_GREEN_3 + "#3#" + RESET + ALL_FONT_SPRING_GREEN_4 + "#4#" + RESET + ALL_FONT_SPRING_GREEN_5 + "#5#" + RESET + ALL_FONT_SPRING_GREEN_6 + "#6#" + RESET);
        // ALL_FONT_TURQUOISE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_TURQUOISE") + "   " + ALL_FONT_TURQUOISE_1 + "#1#" + RESET + ALL_FONT_TURQUOISE_2 + "#2#" + RESET);
        // ALL_FONT_DARK_CYAN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_CYAN") + "   " + ALL_FONT_DARK_CYAN + "###" + RESET);
        // ALL_FONT_LIGHT_SEA_GREEN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_SEA_GREEN") + "   " + ALL_FONT_LIGHT_SEA_GREEN + "###" + RESET);
        // ALL_FONT_CYAN 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_CYAN") + "   " + ALL_FONT_CYAN_1 + "#1#" + RESET + ALL_FONT_CYAN_2 + "#2#" + RESET + ALL_FONT_CYAN_3 + "#3#" + RESET);
        // ALL_FONT_DARK_TURQUOISE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_TURQUOISE") + "   " + ALL_FONT_DARK_TURQUOISE + "###" + RESET);
        // ALL_FONT_MEDIUM_SPRING_GREEN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MEDIUM_SPRING_GREEN") + "   " + ALL_FONT_MEDIUM_SPRING_GREEN + "###" + RESET);
        // ALL_FONT_DARK_RED 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_RED") + "   " + ALL_FONT_DARK_RED_1 + "#1#" + RESET + ALL_FONT_DARK_RED_2 + "#2#" + RESET);
        // ALL_FONT_DEEP_PINK 1 2 3 4 5 6 7 8
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DEEP_PINK") + "   " + ALL_FONT_DEEP_PINK_1 + "#1#" + RESET + ALL_FONT_DEEP_PINK_2 + "#2#" + RESET + ALL_FONT_DEEP_PINK_3 + "#3#" + RESET + ALL_FONT_DEEP_PINK_4 + "#4#" + RESET + ALL_FONT_DEEP_PINK_5 + "#5#" + RESET + ALL_FONT_DEEP_PINK_6 + "#6#" + RESET + ALL_FONT_DEEP_PINK_7 + "#7#" + RESET + ALL_FONT_DEEP_PINK_8 + "#8#" + RESET);
        // ALL_FONT_PURPLE 1 2 3 4 5
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_PURPLE") + "   " + ALL_FONT_PURPLE_1 + "#1#" + RESET + ALL_FONT_PURPLE_2 + "#2#" + RESET + ALL_FONT_PURPLE_3 + "#3#" + RESET + ALL_FONT_PURPLE_4 + "#4#" + RESET + ALL_FONT_PURPLE_5 + "#5#" + RESET);
        // ALL_FONT_BLUE_VIOLET
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_BLUE_VIOLET") + "   " + ALL_FONT_BLUE_VIOLET + "###" + RESET);
        // ALL_FONT_ORANGE 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_ORANGE") + "   " + ALL_FONT_ORANGE_1 + "#1#" + RESET + ALL_FONT_ORANGE_2 + "#2#" + RESET + ALL_FONT_ORANGE_3 + "#3#" + RESET + ALL_FONT_ORANGE_4 + "#4#" + RESET);
        // ALL_FONT_MEDIUM_PURPLE 1 2 3 4 5 6 7
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MEDIUM_PURPLE") + "   " + ALL_FONT_MEDIUM_PURPLE_1 + "#1#" + RESET + ALL_FONT_MEDIUM_PURPLE_2 + "#2#" + RESET + ALL_FONT_MEDIUM_PURPLE_3 + "#3#" + RESET + ALL_FONT_MEDIUM_PURPLE_4 + "#4#" + RESET + ALL_FONT_MEDIUM_PURPLE_5 + "#5#" + RESET + ALL_FONT_MEDIUM_PURPLE_6 + "#6#" + RESET + ALL_FONT_MEDIUM_PURPLE_7 + "#7#" + RESET);
        // ALL_FONT_SLATE_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_SLATE_BLUE") + "   " + ALL_FONT_SLATE_BLUE_1 + "#1#" + RESET + ALL_FONT_SLATE_BLUE_2 + "#2#" + RESET + ALL_FONT_SLATE_BLUE_3 + "#3#" + RESET);
        // ALL_FONT_ROYAL_BLUE 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_ROYAL_BLUE") + "   " + ALL_FONT_ROYAL_BLUE_1 + "#1#" + RESET);
        // ALL_FONT_CHARTREUSE 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_CHARTREUSE") + "   " + ALL_FONT_CHARTREUSE_1 + "#1#" + RESET + ALL_FONT_CHARTREUSE_2 + "#2#" + RESET + ALL_FONT_CHARTREUSE_3 + "#3#" + RESET + ALL_FONT_CHARTREUSE_4 + "#4#" + RESET + ALL_FONT_CHARTREUSE_5 + "#5#" + RESET + ALL_FONT_CHARTREUSE_6 + "#6#" + RESET);
        // ALL_FONT_DARK_SEA_GREEN 1 2 3 4 5 6 7 8 9
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_SEA_GREEN") + "   " + ALL_FONT_DARK_SEA_GREEN_1 + "#1#" + RESET + ALL_FONT_DARK_SEA_GREEN_2 + "#2#" + RESET + ALL_FONT_DARK_SEA_GREEN_3 + "#3#" + RESET + ALL_FONT_DARK_SEA_GREEN_4 + "#4#" + RESET + ALL_FONT_DARK_SEA_GREEN_5 + "#5#" + RESET + ALL_FONT_DARK_SEA_GREEN_6 + "#6#" + RESET + ALL_FONT_DARK_SEA_GREEN_7 + "#7#" + RESET + ALL_FONT_DARK_SEA_GREEN_8 + "#8#" + RESET + ALL_FONT_DARK_SEA_GREEN_9 + "#9#" + RESET);
        // ALL_FONT_DARK_GREEN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_GREEN") + "   " + ALL_FONT_DARK_GREEN + "###" + RESET);
        // ALL_FONT_PALE_TURQUOISE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_PALE_TURQUOISE") + "   " + ALL_FONT_PALE_TURQUOISE_1 + "#1#" + RESET + ALL_FONT_PALE_TURQUOISE_2 + "#2#" + RESET);
        // ALL_FONT_STEEL_BLUE 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_STEEL_BLUE") + "   " + ALL_FONT_STEEL_BLUE_1 + "#1#" + RESET + ALL_FONT_STEEL_BLUE_2 + "#2#" + RESET + ALL_FONT_STEEL_BLUE_3 + "#3#" + RESET + ALL_FONT_STEEL_BLUE_4 + "#4#" + RESET);
        // ALL_FONT_CORNFLOWER_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_CORNFLOWER_BLUE") + "   " + ALL_FONT_CORNFLOWER_BLUE + "###" + RESET);
        // ALL_FONT_CADET_BLUE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_CADET_BLUE") + "   " + ALL_FONT_CADET_BLUE_1 + "#1#" + RESET + ALL_FONT_CADET_BLUE_2 + "#2#" + RESET);
        // ALL_FONT_SKY_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_SKY_BLUE") + "   " + ALL_FONT_SKY_BLUE_1 + "#1#" + RESET + ALL_FONT_SKY_BLUE_2 + "#2#" + RESET + ALL_FONT_SKY_BLUE_3 + "#3#" + RESET);
        // ALL_FONT_PALE_GREEN 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_PALE_GREEN") + "   " + ALL_FONT_PALE_GREEN_1 + "#1#" + RESET + ALL_FONT_PALE_GREEN_2 + "#2#" + RESET + ALL_FONT_PALE_GREEN_3 + "#3#" + RESET + ALL_FONT_PALE_GREEN_4 + "#4#" + RESET);
        // ALL_FONT_SEA_GREEN 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_SEA_GREEN") + "   " + ALL_FONT_SEA_GREEN_1 + "#1#" + RESET + ALL_FONT_SEA_GREEN_2 + "#2#" + RESET + ALL_FONT_SEA_GREEN_3 + "#3#" + RESET + ALL_FONT_SEA_GREEN_4 + "#4#" + RESET);
        // ALL_FONT_AQUAMARINE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_AQUAMARINE") + "   " + ALL_FONT_AQUAMARINE_1 + "#1#" + RESET + ALL_FONT_AQUAMARINE_2 + "#2#" + RESET + ALL_FONT_AQUAMARINE_3 + "#3#" + RESET);
        // ALL_FONT_MEDIUM_TURQUOISE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MEDIUM_TURQUOISE") + "   " + ALL_FONT_MEDIUM_TURQUOISE + "###" + RESET);
        // ALL_FONT_DARK_SLATE_GRAY 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_SLATE_GRAY") + "   " + ALL_FONT_DARK_SLATE_GRAY_1 + "#1#" + RESET + ALL_FONT_DARK_SLATE_GRAY_2 + "#2#" + RESET + ALL_FONT_DARK_SLATE_GRAY_3 + "#3#" + RESET);
        // ALL_FONT_DARK_MAGENTA 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_MAGENTA") + "   " + ALL_FONT_DARK_MAGENTA_1 + "#1#" + RESET + ALL_FONT_DARK_MAGENTA_2 + "#2#" + RESET);
        // ALL_FONT_DARK_VIOLET 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_VIOLET") + "   " + ALL_FONT_DARK_VIOLET_1 + "#1#" + RESET + ALL_FONT_DARK_VIOLET_2 + "#2#" + RESET);
        // ALL_FONT_LIGHT_PINK 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_PINK") + "   " + ALL_FONT_LIGHT_PINK_1 + "#1#" + RESET + ALL_FONT_LIGHT_PINK_2 + "#2#" + RESET + ALL_FONT_LIGHT_PINK_3 + "#3#" + RESET);
        // ALL_FONT_PLUM 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_PLUM") + "   " + ALL_FONT_PLUM_1 + "#1#" + RESET + ALL_FONT_PLUM_2 + "#2#" + RESET + ALL_FONT_PLUM_3 + "#3#" + RESET + ALL_FONT_PLUM_4 + "#4#" + RESET);
        // ALL_FONT_YELLOW 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_YELLOW") + "   " + ALL_FONT_YELLOW_1 + "#1#" + RESET + ALL_FONT_YELLOW_2 + "#2#" + RESET + ALL_FONT_YELLOW_3 + "#3#" + RESET + ALL_FONT_YELLOW_4 + "#4#" + RESET + ALL_FONT_YELLOW_5 + "#5#" + RESET + ALL_FONT_YELLOW_6 + "#6#" + RESET);
        // ALL_FONT_WHEAT 1 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_WHEAT") + "   " + ALL_FONT_WHEAT_1 + "#1#" + RESET + ALL_FONT_WHEAT_4 + "#2#" + RESET);
        // ALL_FONT_LIGHT_SLATE_GREY
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_SLATE_GREY") + "   " + ALL_FONT_LIGHT_SLATE_GREY + "###" + RESET);
        // ALL_FONT_LIGHT_SLATE_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_SLATE_BLUE") + "   " + ALL_FONT_LIGHT_SLATE_BLUE + "###" + RESET);
        // ALL_FONT_DARK_OLIVE_GREEN 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_OLIVE_GREEN") + "   " + ALL_FONT_DARK_OLIVE_GREEN_1 + "#1#" + RESET + ALL_FONT_DARK_OLIVE_GREEN_2 + "#2#" + RESET + ALL_FONT_DARK_OLIVE_GREEN_3 + "#3#" + RESET + ALL_FONT_DARK_OLIVE_GREEN_4 + "#4#" + RESET + ALL_FONT_DARK_OLIVE_GREEN_5 + "#5#" + RESET + ALL_FONT_DARK_OLIVE_GREEN_6 + "#6#" + RESET);
        // ALL_FONT_LIGHT_SKY_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_SKY_BLUE") + "   " + ALL_FONT_LIGHT_SKY_BLUE_1 + "#1#" + RESET + ALL_FONT_LIGHT_SKY_BLUE_2 + "#2#" + RESET + ALL_FONT_LIGHT_SKY_BLUE_3 + "#3#" + RESET);
        // ALL_FONT_LIGHT_GREEN 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_GREEN") + "   " + ALL_FONT_LIGHT_GREEN_1 + "#1#" + RESET + ALL_FONT_LIGHT_GREEN_2 + "#2#" + RESET);
        // ALL_FONT_RED 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_RED") + "   " + ALL_FONT_RED_1 + "#1#" + RESET + ALL_FONT_RED_2 + "#2#" + RESET + ALL_FONT_RED_3 + "#3#" + RESET);
        // ALL_FONT_MEDIUM_VIOLET_RED
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MEDIUM_VIOLET_RED") + "   " + ALL_FONT_MEDIUM_VIOLET_RED + "###" + RESET);
        // ALL_FONT_MAGENTA 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MAGENTA") + "   " + ALL_FONT_MAGENTA_1 + "#1#" + RESET + ALL_FONT_MAGENTA_2 + "#2#" + RESET + ALL_FONT_MAGENTA_3 + "#3#" + RESET + ALL_FONT_MAGENTA_4 + "#4#" + RESET + ALL_FONT_MAGENTA_5 + "#5#" + RESET + ALL_FONT_MAGENTA_6 + "#6#" + RESET);
        // ALL_FONT_DARK_ORANGE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_ORANGE") + "   " + ALL_FONT_DARK_ORANGE_1 + "#1#" + RESET + ALL_FONT_DARK_ORANGE_2 + "#2#" + RESET + ALL_FONT_DARK_ORANGE_3 + "#3#" + RESET);
        // ALL_FONT_INDIAN_RED 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_INDIAN_RED") + "   " + ALL_FONT_INDIAN_RED_1 + "#1#" + RESET + ALL_FONT_INDIAN_RED_2 + "#2#" + RESET + ALL_FONT_INDIAN_RED_3 + "#3#" + RESET + ALL_FONT_INDIAN_RED_4 + "#4#" + RESET);
        // ALL_FONT_HOT_PINK 1 2 3 4 5
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_HOT_PINK") + "   " + ALL_FONT_HOT_PINK_1 + "#1#" + RESET + ALL_FONT_HOT_PINK_2 + "#2#" + RESET + ALL_FONT_HOT_PINK_3 + "#3#" + RESET + ALL_FONT_HOT_PINK_4 + "#4#" + RESET + ALL_FONT_HOT_PINK_5 + "#5#" + RESET);
        // ALL_FONT_MEDIUM_ORCHID 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MEDIUM_ORCHID") + "   " + ALL_FONT_MEDIUM_ORCHID_1 + "#1#" + RESET + ALL_FONT_MEDIUM_ORCHID_2 + "#2#" + RESET + ALL_FONT_MEDIUM_ORCHID_3 + "#3#" + RESET + ALL_FONT_MEDIUM_ORCHID_4 + "#4#" + RESET);
        // ALL_FONT_DARK_GOLDENROD
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_GOLDENROD") + "   " + ALL_FONT_DARK_GOLDENROD + "###" + RESET);
        // ALL_FONT_LIGHT_SALMON 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_SALMON") + "   " + ALL_FONT_LIGHT_SALMON_1 + "#1#" + RESET + ALL_FONT_LIGHT_SALMON_2 + "#2#" + RESET + ALL_FONT_LIGHT_SALMON_3 + "#3#" + RESET);
        // ALL_FONT_ROSY_BROWN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_ROSY_BROWN") + "   " + ALL_FONT_ROSY_BROWN + "###" + RESET);
        // ALL_FONT_GOLD 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_GOLD") + "   " + ALL_FONT_GOLD_1 + "#1#" + RESET + ALL_FONT_GOLD_2 + "#2#" + RESET + ALL_FONT_GOLD_3 + "#3#" + RESET);
        // ALL_FONT_DARK_KHAKI
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_DARK_KHAKI") + "   " + ALL_FONT_DARK_KHAKI + "###" + RESET);
        // ALL_FONT_NAVAJO_WHITE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_NAVAJO_WHITE") + "   " + ALL_FONT_NAVAJO_WHITE_1 + "#1#" + RESET + ALL_FONT_NAVAJO_WHITE_2 + "#2#" + RESET);
        // ALL_FONT_LIGHT_STEEL_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_STEEL_BLUE") + "   " + ALL_FONT_LIGHT_STEEL_BLUE_1 + "#1#" + RESET + ALL_FONT_LIGHT_STEEL_BLUE_2 + "#2#" + RESET + ALL_FONT_LIGHT_STEEL_BLUE_3 + "#3#" + RESET);
        // ALL_FONT_LIGHT_CYAN 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_CYAN") + "   " + ALL_FONT_LIGHT_CYAN_1 + "#1#" + RESET + ALL_FONT_LIGHT_CYAN_2 + "#2#" + RESET);
        // ALL_FONT_GREEN_YELLOW
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_GREEN_YELLOW") + "   " + ALL_FONT_GREEN_YELLOW + "###" + RESET);
        // ALL_FONT_ORCHID 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_ORCHID") + "   " + ALL_FONT_ORCHID_1 + "#1#" + RESET + ALL_FONT_ORCHID_2 + "#2#" + RESET + ALL_FONT_ORCHID_3 + "#3#" + RESET);
        // ALL_FONT_PINK 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_PINK") + "   " + ALL_FONT_PINK_1 + "#1#" + RESET + ALL_FONT_PINK_2 + "#2#" + RESET);
        // ALL_FONT_VIOLET
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_VIOLET") + "   " + ALL_FONT_VIOLET + "###" + RESET);
        // ALL_FONT_LIGHT_GOLDENROD 1 2 3 4 5
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_GOLDENROD") + "   " + ALL_FONT_LIGHT_GOLDENROD_1 + "#1#" + RESET + ALL_FONT_LIGHT_GOLDENROD_2 + "#2#" + RESET + ALL_FONT_LIGHT_GOLDENROD_3 + "#3#" + RESET + ALL_FONT_LIGHT_GOLDENROD_4 + "#4#" + RESET + ALL_FONT_LIGHT_GOLDENROD_5 + "#5#" + RESET);
        // ALL_FONT_TAN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_TAN") + "   " + ALL_FONT_TAN + "###" + RESET);
        // ALL_FONT_MISTY_ROSE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_MISTY_ROSE") + "   " + ALL_FONT_MISTY_ROSE_1 + "#1#" + RESET + ALL_FONT_MISTY_ROSE_2 + "#2#" + RESET);
        // ALL_FONT_THISTLE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_THISTLE") + "   " + ALL_FONT_THISTLE_1 + "#1#" + RESET + ALL_FONT_THISTLE_2 + "#2#" + RESET);
        // ALL_FONT_KHAKI 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_KHAKI") + "   " + ALL_FONT_KHAKI_1 + "#1#" + RESET + ALL_FONT_KHAKI_2 + "#2#" + RESET);
        // ALL_FONT_LIGHT_YELLOW 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_YELLOW") + "   " + ALL_FONT_LIGHT_YELLOW_3 + "#3#" + RESET);
        // ALL_FONT_HONEYDEW 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_HONEYDEW") + "   " + ALL_FONT_HONEYDEW_2 + "#2#" + RESET);
        // ALL_FONT_ORANGE_RED 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_ORANGE_RED") + "   " + ALL_FONT_ORANGE_RED_1 + "#1#" + RESET);
        // ALL_FONT_SALMON 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_SALMON") + "   " + ALL_FONT_SALMON_1 + "#1#" + RESET);
        // ALL_FONT_LIGHT_CORAL
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_LIGHT_CORAL") + "   " + ALL_FONT_LIGHT_CORAL + "###" + RESET);
        // ALL_FONT_PALE_VIOLET_RED 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_PALE_VIOLET_RED") + "   " + ALL_FONT_PALE_VIOLET_RED_1 + "#1#" + RESET);
        //  ALL_FONT_SANDY_BROWN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_SANDY_BROWN") + "   " + ALL_FONT_SANDY_BROWN + "###" + RESET);
        //  ALL_FONT_CORNSILK
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_FONT_CORNSILK") + "   " + ALL_FONT_CORNSILK_1 + "#1#" + RESET);
    }


    public static void printSystemBackground() {
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_BLACK + "### ALL SYSTEM BLACK ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_MAROON + "### ALL SYSTEM MAROON ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_GREEN + "### ALL SYSTEM GREEN ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_OLIVE + "### ALL SYSTEM OLIVE ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_NAVY + "### ALL SYSTEM NAVY ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_PURPLE + "### ALL SYSTEM PURPLE ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_TEAL + "### ALL SYSTEM TEAL ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_SILVER + "### ALL SYSTEM SILVER ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_GREY + "### ALL SYSTEM GREY ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_RED + "### ALL SYSTEM RED ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_LIME + "### ALL SYSTEM LIME ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_YELLOW + "### ALL SYSTEM YELLOW ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_BLUE + "### ALL SYSTEM BLUE ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_FUCHSIA + "### ALL SYSTEM FUCHSIA ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_AQUA + "### ALL SYSTEM AQUA ###" + RESET + " ");
        System.out.println("  " + ALL_BACKGROUND_SYSTEM_WHITE + "### ALL SYSTEM WHITE ###" + RESET + " ");
    }


    public static void printGreyBackground() {
        System.out.println("  " + ALL_BACKGROUND_GREY_0 + "### ALL GREY 0 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_3 + "### ALL GREY 3 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_7 + "### ALL GREY 7 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_11 + "### ALL GREY 11 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_15 + "### ALL GREY 15 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_19 + "### ALL GREY 19 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_23 + "### ALL GREY 23 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_27 + "### ALL GREY 27 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_30 + "### ALL GREY 30 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_35 + "### ALL GREY 35 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_37 + "### ALL GREY 37 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_39 + "### ALL GREY 39 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_42 + "### ALL GREY 42 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_46 + "### ALL GREY 46 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_50 + "### ALL GREY 50 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_53 + "### ALL GREY 53 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_54 + "### ALL GREY 54 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_58 + "### ALL GREY 58 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_62 + "### ALL GREY 62 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_63 + "### ALL GREY 63 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_66 + "### ALL GREY 66 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_69 + "### ALL GREY 69 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_70 + "### ALL GREY 70 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_74 + "### ALL GREY 74 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_78 + "### ALL GREY 78 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_82 + "### ALL GREY 82 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_84 + "### ALL GREY 84 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_85 + "### ALL GREY 85 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_89 + "### ALL GREY 89 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_93 + "### ALL GREY 93 ###" + RESET);
        System.out.println("  " + ALL_BACKGROUND_GREY_100 + "### ALL GREY 100###" + RESET);

    }


    public static void printGreyBackgroundCompact() {
        System.out.println("  GREY (Compact test, for more, run testGreyBackground())");

        System.out.print("  " + ALL_BACKGROUND_GREY_0 + "#00#" + RESET + ALL_BACKGROUND_GREY_3 + "#03#" + RESET + ALL_BACKGROUND_GREY_7 + "#07#" + RESET + ALL_BACKGROUND_GREY_11 + "#11#" + RESET + ALL_BACKGROUND_GREY_15 + "#15#" + RESET);
        System.out.print(ALL_BACKGROUND_GREY_19 + "#19#" + RESET + ALL_BACKGROUND_GREY_23 + "#23#" + RESET + ALL_BACKGROUND_GREY_27 + "#27#" + RESET + ALL_BACKGROUND_GREY_30 + "#30#" + RESET + ALL_BACKGROUND_GREY_35 + "#35#" + RESET);
        System.out.print(ALL_BACKGROUND_GREY_37 + "#37#" + ALL_BACKGROUND_GREY_39 + "#39#" + RESET + ALL_BACKGROUND_GREY_42 + "#42#" + RESET + ALL_BACKGROUND_GREY_46 + "#46#" + RESET + ALL_BACKGROUND_GREY_50 + "#50#" + RESET + ALL_BACKGROUND_GREY_53 + "#53#" + RESET + ALL_BACKGROUND_GREY_54 + "#54#" + RESET);
        System.out.print(ALL_BACKGROUND_GREY_58 + "#58#" + RESET + ALL_BACKGROUND_GREY_62 + "#62#" + RESET + ALL_BACKGROUND_GREY_63 + "#63#" + RESET + ALL_BACKGROUND_GREY_66 + "#66#" + RESET + ALL_BACKGROUND_GREY_69 + "#69#" + RESET + ALL_BACKGROUND_GREY_70 + "#70#" + RESET + ALL_BACKGROUND_GREY_74 + "#74#" + RESET);
        System.out.print(ALL_BACKGROUND_GREY_78 + "#78#" + RESET + ALL_BACKGROUND_GREY_82 + "#82#" + RESET + ALL_BACKGROUND_GREY_84 + "#84#" + RESET + ALL_BACKGROUND_GREY_85 + "#85#" + RESET + ALL_BACKGROUND_GREY_89 + "#89#" + RESET + ALL_BACKGROUND_GREY_93 + "#93#" + RESET + ALL_BACKGROUND_GREY_100 + "#100#" + RESET);
    }


    public static void printALLBackground() {
        // ALL_BACKGROUND_NAVY_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_NAVY_BLUE") + "   " + ALL_BACKGROUND_NAVY_BLUE + "###" + RESET);
        // ALL_BACKGROUND_DARK_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_BLUE") + "   " + ALL_BACKGROUND_DARK_BLUE + "###" + RESET);
        // ALL_BACKGROUND_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_BLUE") + "   " + ALL_BACKGROUND_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_BLUE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_GREEN 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_GREEN") + "   " + ALL_BACKGROUND_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_GREEN_2 + "#2#" + RESET + ALL_BACKGROUND_GREEN_3 + "#3#" + RESET + ALL_BACKGROUND_GREEN_4 + "#4#" + RESET);
        // ALL_BACKGROUND_DEEP_SKY_BLUE 1 2 3 4 5 6 7
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DEEP_SKY_BLUE") + "   " + ALL_BACKGROUND_DEEP_SKY_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_DEEP_SKY_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_DEEP_SKY_BLUE_3 + "#3#" + RESET + ALL_BACKGROUND_DEEP_SKY_BLUE_4 + "#4#" + RESET + ALL_BACKGROUND_DEEP_SKY_BLUE_5 + "#5#" + RESET + ALL_BACKGROUND_DEEP_SKY_BLUE_6 + "#6#" + RESET + ALL_BACKGROUND_DEEP_SKY_BLUE_7 + "#7#" + RESET);
        // ALL_BACKGROUND_DODGER_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DODGER_BLUE") + "   " + ALL_BACKGROUND_DODGER_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_DODGER_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_DODGER_BLUE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_SPRING_GREEN 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_SPRING_GREEN") + "   " + ALL_BACKGROUND_SPRING_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_SPRING_GREEN_2 + "#2#" + RESET + ALL_BACKGROUND_SPRING_GREEN_3 + "#3#" + RESET + ALL_BACKGROUND_SPRING_GREEN_4 + "#4#" + RESET + ALL_BACKGROUND_SPRING_GREEN_5 + "#5#" + RESET + ALL_BACKGROUND_SPRING_GREEN_6 + "#6#" + RESET);
        // ALL_BACKGROUND_TURQUOISE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_TURQUOISE") + "   " + ALL_BACKGROUND_TURQUOISE_1 + "#1#" + RESET + ALL_BACKGROUND_TURQUOISE_2 + "#2#" + RESET);
        // ALL_BACKGROUND_DARK_CYAN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_CYAN") + "   " + ALL_BACKGROUND_DARK_CYAN + "###" + RESET);
        // ALL_BACKGROUND_DARK_GREEN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_GREEN") + "   " + ALL_BACKGROUND_DARK_GREEN + "###" + RESET);
        // ALL_BACKGROUND_LIGHT_SEA_GREEN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_SEA_GREEN") + "   " + ALL_BACKGROUND_LIGHT_SEA_GREEN + "###" + RESET);
        // ALL_BACKGROUND_CYAN 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_CYAN") + "   " + ALL_BACKGROUND_CYAN_1 + "#1#" + RESET + ALL_BACKGROUND_CYAN_2 + "#2#" + RESET + ALL_BACKGROUND_CYAN_3 + "#3#" + RESET);
        // ALL_BACKGROUND_DARK_TURQUOISE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_TURQUOISE") + "   " + ALL_BACKGROUND_DARK_TURQUOISE + "###" + RESET);
        // ALL_BACKGROUND_MEDIUM_SPRING_GREEN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MEDIUM_SPRING_GREEN") + "   " + ALL_BACKGROUND_MEDIUM_SPRING_GREEN + "###" + RESET);
        // ALL_BACKGROUND_DARK_RED 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_RED") + "   " + ALL_BACKGROUND_DARK_RED_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_RED_2 + "#2#" + RESET);
        // ALL_BACKGROUND_DEEP_PINK 1 2 3 4 5 6 7 8
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DEEP_PINK") + "   " + ALL_BACKGROUND_DEEP_PINK_1 + "#1#" + RESET + ALL_BACKGROUND_DEEP_PINK_2 + "#2#" + RESET + ALL_BACKGROUND_DEEP_PINK_3 + "#3#" + RESET + ALL_BACKGROUND_DEEP_PINK_4 + "#4#" + RESET + ALL_BACKGROUND_DEEP_PINK_5 + "#5#" + RESET + ALL_BACKGROUND_DEEP_PINK_6 + "#6#" + RESET + ALL_BACKGROUND_DEEP_PINK_7 + "#7#" + RESET + ALL_BACKGROUND_DEEP_PINK_8 + "#8#" + RESET);
        // ALL_BACKGROUND_PURPLE 1 2 3 4 5
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_PURPLE") + "   " + ALL_BACKGROUND_PURPLE_1 + "#1#" + RESET + ALL_BACKGROUND_PURPLE_2 + "#2#" + RESET + ALL_BACKGROUND_PURPLE_3 + "#3#" + RESET + ALL_BACKGROUND_PURPLE_4 + "#4#" + RESET + ALL_BACKGROUND_PURPLE_5 + "#5#" + RESET);
        // ALL_BACKGROUND_BLUE_VIOLET
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_BLUE_VIOLET") + "   " + ALL_BACKGROUND_BLUE_VIOLET + "###" + RESET);
        // ALL_BACKGROUND_ORANGE 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_ORANGE") + "   " + ALL_BACKGROUND_ORANGE_1 + "#1#" + RESET + ALL_BACKGROUND_ORANGE_2 + "#2#" + RESET + ALL_BACKGROUND_ORANGE_3 + "#3#" + RESET + ALL_BACKGROUND_ORANGE_4 + "#4#" + RESET);
        // ALL_BACKGROUND_MEDIUM_PURPLE 1 2 3 4 5 6 7
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MEDIUM_PURPLE") + "   " + ALL_BACKGROUND_MEDIUM_PURPLE_1 + "#1#" + RESET + ALL_BACKGROUND_MEDIUM_PURPLE_2 + "#2#" + RESET + ALL_BACKGROUND_MEDIUM_PURPLE_3 + "#3#" + RESET + ALL_BACKGROUND_MEDIUM_PURPLE_4 + "#4#" + RESET + ALL_BACKGROUND_MEDIUM_PURPLE_5 + "#5#" + RESET + ALL_BACKGROUND_MEDIUM_PURPLE_6 + "#6#" + RESET + ALL_BACKGROUND_MEDIUM_PURPLE_7 + "#7#" + RESET);
        // ALL_BACKGROUND_SLATE_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_SLATE_BLUE") + "   " + ALL_BACKGROUND_SLATE_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_SLATE_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_SLATE_BLUE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_ROYAL_BLUE 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_ROYAL_BLUE") + "   " + ALL_BACKGROUND_ROYAL_BLUE_1 + "#1#" + RESET);
        // ALL_BACKGROUND_CHARTREUSE 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_CHARTREUSE") + "   " + ALL_BACKGROUND_CHARTREUSE_1 + "#1#" + RESET + ALL_BACKGROUND_CHARTREUSE_2 + "#2#" + RESET + ALL_BACKGROUND_CHARTREUSE_3 + "#3#" + RESET + ALL_BACKGROUND_CHARTREUSE_4 + "#4#" + RESET + ALL_BACKGROUND_CHARTREUSE_5 + "#5#" + RESET + ALL_BACKGROUND_CHARTREUSE_6 + "#6#" + RESET);
        // ALL_BACKGROUND_DARK_SEA_GREEN 1 2 3 4 5 6 7 8 9
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_SEA_GREEN") + "   " + ALL_BACKGROUND_DARK_SEA_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_2 + "#2#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_3 + "#3#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_4 + "#4#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_5 + "#5#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_6 + "#6#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_7 + "#7#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_8 + "#8#" + RESET + ALL_BACKGROUND_DARK_SEA_GREEN_9 + "#9#" + RESET);
        // ALL_BACKGROUND_PALE_TURQUOISE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_PALE_TURQUOISE") + "   " + ALL_BACKGROUND_PALE_TURQUOISE_1 + "#1#" + RESET + ALL_BACKGROUND_PALE_TURQUOISE_2 + "#2#" + RESET);
        // ALL_BACKGROUND_STEEL_BLUE 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_STEEL_BLUE") + "   " + ALL_BACKGROUND_STEEL_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_STEEL_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_STEEL_BLUE_3 + "#3#" + RESET + ALL_BACKGROUND_STEEL_BLUE_4 + "#4#" + RESET);
        // ALL_BACKGROUND_CORNFLOWER_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_CORNFLOWER_BLUE") + "   " + ALL_BACKGROUND_CORNFLOWER_BLUE + "###" + RESET);
        // ALL_BACKGROUND_CADET_BLUE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_CADET_BLUE") + "   " + ALL_BACKGROUND_CADET_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_CADET_BLUE_2 + "#2#" + RESET);
        // ALL_BACKGROUND_SKY_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_SKY_BLUE") + "   " + ALL_BACKGROUND_SKY_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_SKY_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_SKY_BLUE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_PALE_GREEN 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_PALE_GREEN") + "   " + ALL_BACKGROUND_PALE_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_PALE_GREEN_2 + "#2#" + RESET + ALL_BACKGROUND_PALE_GREEN_3 + "#3#" + RESET + ALL_BACKGROUND_PALE_GREEN_4 + "#4#" + RESET);
        // ALL_BACKGROUND_SEA_GREEN 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_SEA_GREEN") + "   " + ALL_BACKGROUND_SEA_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_SEA_GREEN_2 + "#2#" + RESET + ALL_BACKGROUND_SEA_GREEN_3 + "#3#" + RESET + ALL_BACKGROUND_SEA_GREEN_4 + "#4#" + RESET);
        // ALL_BACKGROUND_AQUAMARINE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_AQUAMARINE") + "   " + ALL_BACKGROUND_AQUAMARINE_1 + "#1#" + RESET + ALL_BACKGROUND_AQUAMARINE_2 + "#2#" + RESET + ALL_BACKGROUND_AQUAMARINE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_MEDIUM_TURQUOISE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MEDIUM_TURQUOISE") + "   " + ALL_BACKGROUND_MEDIUM_TURQUOISE + "###" + RESET);
        // ALL_BACKGROUND_DARK_SLATE_GRAY 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_SLATE_GRAY") + "   " + ALL_BACKGROUND_DARK_SLATE_GRAY_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_SLATE_GRAY_2 + "#2#" + RESET + ALL_BACKGROUND_DARK_SLATE_GRAY_3 + "#3#" + RESET);
        // ALL_BACKGROUND_DARK_MAGENTA 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_MAGENTA") + "   " + ALL_BACKGROUND_DARK_MAGENTA_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_MAGENTA_2 + "#2#" + RESET);
        // ALL_BACKGROUND_DARK_VIOLET 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_VIOLET") + "   " + ALL_BACKGROUND_DARK_VIOLET_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_VIOLET_2 + "#2#" + RESET);
        // ALL_BACKGROUND_LIGHT_PINK 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_PINK") + "   " + ALL_BACKGROUND_LIGHT_PINK_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_PINK_2 + "#2#" + RESET + ALL_BACKGROUND_LIGHT_PINK_3 + "#3#" + RESET);
        // ALL_BACKGROUND_PLUM 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_PLUM") + "   " + ALL_BACKGROUND_PLUM_1 + "#1#" + RESET + ALL_BACKGROUND_PLUM_2 + "#2#" + RESET + ALL_BACKGROUND_PLUM_3 + "#3#" + RESET + ALL_BACKGROUND_PLUM_4 + "#4#" + RESET);
        // ALL_BACKGROUND_YELLOW 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_YELLOW") + "   " + ALL_BACKGROUND_YELLOW_1 + "#1#" + RESET + ALL_BACKGROUND_YELLOW_2 + "#2#" + RESET + ALL_BACKGROUND_YELLOW_3 + "#3#" + RESET + ALL_BACKGROUND_YELLOW_4 + "#4#" + RESET + ALL_BACKGROUND_YELLOW_5 + "#5#" + RESET + ALL_BACKGROUND_YELLOW_6 + "#6#" + RESET);
        // ALL_BACKGROUND_WHEAT 1 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_WHEAT") + "   " + ALL_BACKGROUND_WHEAT_1 + "#1#" + RESET + ALL_BACKGROUND_WHEAT_4 + "#2#" + RESET);
        // ALL_BACKGROUND_LIGHT_SLATE_GREY
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_SLATE_GREY") + "   " + ALL_BACKGROUND_LIGHT_SLATE_GREY + "###" + RESET);
        // ALL_BACKGROUND_LIGHT_SLATE_BLUE
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_SLATE_BLUE") + "   " + ALL_BACKGROUND_LIGHT_SLATE_BLUE + "###" + RESET);
        // ALL_BACKGROUND_DARK_OLIVE_GREEN 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_OLIVE_GREEN") + "   " + ALL_BACKGROUND_DARK_OLIVE_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_OLIVE_GREEN_2 + "#2#" + RESET + ALL_BACKGROUND_DARK_OLIVE_GREEN_3 + "#3#" + RESET + ALL_BACKGROUND_DARK_OLIVE_GREEN_4 + "#4#" + RESET + ALL_BACKGROUND_DARK_OLIVE_GREEN_5 + "#5#" + RESET + ALL_BACKGROUND_DARK_OLIVE_GREEN_6 + "#6#" + RESET);
        // ALL_BACKGROUND_LIGHT_SKY_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_SKY_BLUE") + "   " + ALL_BACKGROUND_LIGHT_SKY_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_SKY_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_LIGHT_SKY_BLUE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_LIGHT_GREEN 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_GREEN") + "   " + ALL_BACKGROUND_LIGHT_GREEN_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_GREEN_2 + "#2#" + RESET);
        // ALL_BACKGROUND_RED 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_RED") + "   " + ALL_BACKGROUND_RED_1 + "#1#" + RESET + ALL_BACKGROUND_RED_2 + "#2#" + RESET + ALL_BACKGROUND_RED_3 + "#3#" + RESET);
        // ALL_BACKGROUND_MEDIUM_VIOLET_RED
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MEDIUM_VIOLET_RED") + "   " + ALL_BACKGROUND_MEDIUM_VIOLET_RED + "###" + RESET);
        // ALL_BACKGROUND_MAGENTA 1 2 3 4 5 6
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MAGENTA") + "   " + ALL_BACKGROUND_MAGENTA_1 + "#1#" + RESET + ALL_BACKGROUND_MAGENTA_2 + "#2#" + RESET + ALL_BACKGROUND_MAGENTA_3 + "#3#" + RESET + ALL_BACKGROUND_MAGENTA_4 + "#4#" + RESET + ALL_BACKGROUND_MAGENTA_5 + "#5#" + RESET + ALL_BACKGROUND_MAGENTA_6 + "#6#" + RESET);
        // ALL_BACKGROUND_DARK_ORANGE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_ORANGE") + "   " + ALL_BACKGROUND_DARK_ORANGE_1 + "#1#" + RESET + ALL_BACKGROUND_DARK_ORANGE_2 + "#2#" + RESET + ALL_BACKGROUND_DARK_ORANGE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_INDIAN_RED 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_INDIAN_RED") + "   " + ALL_BACKGROUND_INDIAN_RED_1 + "#1#" + RESET + ALL_BACKGROUND_INDIAN_RED_2 + "#2#" + RESET + ALL_BACKGROUND_INDIAN_RED_3 + "#3#" + RESET + ALL_BACKGROUND_INDIAN_RED_4 + "#4#" + RESET);
        // ALL_BACKGROUND_HOT_PINK 1 2 3 4 5
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_HOT_PINK") + "   " + ALL_BACKGROUND_HOT_PINK_1 + "#1#" + RESET + ALL_BACKGROUND_HOT_PINK_2 + "#2#" + RESET + ALL_BACKGROUND_HOT_PINK_3 + "#3#" + RESET + ALL_BACKGROUND_HOT_PINK_4 + "#4#" + RESET + ALL_BACKGROUND_HOT_PINK_5 + "#5#" + RESET);
        // ALL_BACKGROUND_MEDIUM_ORCHID 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MEDIUM_ORCHID") + "   " + ALL_BACKGROUND_MEDIUM_ORCHID_1 + "#1#" + RESET + ALL_BACKGROUND_MEDIUM_ORCHID_2 + "#2#" + RESET + ALL_BACKGROUND_MEDIUM_ORCHID_3 + "#3#" + RESET + ALL_BACKGROUND_MEDIUM_ORCHID_4 + "#4#" + RESET);
        // ALL_BACKGROUND_DARK_GOLDENROD
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_GOLDENROD") + "   " + ALL_BACKGROUND_DARK_GOLDENROD + "###" + RESET);
        // ALL_BACKGROUND_LIGHT_SALMON 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_SALMON") + "   " + ALL_BACKGROUND_LIGHT_SALMON_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_SALMON_2 + "#2#" + RESET + ALL_BACKGROUND_LIGHT_SALMON_3 + "#3#" + RESET);
        // ALL_BACKGROUND_ROSY_BROWN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_ROSY_BROWN") + "   " + ALL_BACKGROUND_ROSY_BROWN + "###" + RESET);
        // ALL_BACKGROUND_GOLD 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_GOLD") + "   " + ALL_BACKGROUND_GOLD_1 + "#1#" + RESET + ALL_BACKGROUND_GOLD_2 + "#2#" + RESET + ALL_BACKGROUND_GOLD_3 + "#3#" + RESET);
        // ALL_BACKGROUND_DARK_KHAKI
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_DARK_KHAKI") + "   " + ALL_BACKGROUND_DARK_KHAKI + "###" + RESET);
        // ALL_BACKGROUND_NAVAJO_WHITE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_NAVAJO_WHITE") + "   " + ALL_BACKGROUND_NAVAJO_WHITE_1 + "#1#" + RESET + ALL_BACKGROUND_NAVAJO_WHITE_2 + "#2#" + RESET);
        // ALL_BACKGROUND_LIGHT_STEEL_BLUE 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_STEEL_BLUE") + "   " + ALL_BACKGROUND_LIGHT_STEEL_BLUE_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_STEEL_BLUE_2 + "#2#" + RESET + ALL_BACKGROUND_LIGHT_STEEL_BLUE_3 + "#3#" + RESET);
        // ALL_BACKGROUND_LIGHT_CYAN 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_CYAN") + "   " + ALL_BACKGROUND_LIGHT_CYAN_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_CYAN_2 + "#2#" + RESET);
        // ALL_BACKGROUND_GREEN_YELLOW
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_GREEN_YELLOW") + "   " + ALL_BACKGROUND_GREEN_YELLOW + "###" + RESET);
        // ALL_BACKGROUND_ORCHID 1 2 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_ORCHID") + "   " + ALL_BACKGROUND_ORCHID_1 + "#1#" + RESET + ALL_BACKGROUND_ORCHID_2 + "#2#" + RESET + ALL_BACKGROUND_ORCHID_3 + "#3#" + RESET);
        // ALL_BACKGROUND_PINK 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_PINK") + "   " + ALL_BACKGROUND_PINK_1 + "#1#" + RESET + ALL_BACKGROUND_PINK_2 + "#2#" + RESET);
        // ALL_BACKGROUND_VIOLET
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_VIOLET") + "   " + ALL_BACKGROUND_VIOLET + "###" + RESET);
        // ALL_BACKGROUND_LIGHT_GOLDENROD 1 2 3 4
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_GOLDENROD") + "   " + ALL_BACKGROUND_LIGHT_GOLDENROD_1 + "#1#" + RESET + ALL_BACKGROUND_LIGHT_GOLDENROD_2 + "#2#" + RESET + ALL_BACKGROUND_LIGHT_GOLDENROD_3 + "#3#" + RESET + ALL_BACKGROUND_LIGHT_GOLDENROD_4 + "#4#" + RESET + ALL_BACKGROUND_LIGHT_GOLDENROD_5 + "#5#" + RESET);
        // ALL_BACKGROUND_TAN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_TAN") + "   " + ALL_BACKGROUND_TAN + "###" + RESET);
        // ALL_BACKGROUND_MISTY_ROSE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_MISTY_ROSE") + "   " + ALL_BACKGROUND_MISTY_ROSE_1 + "#1#" + RESET + ALL_BACKGROUND_MISTY_ROSE_2 + "#2#" + RESET);
        // ALL_BACKGROUND_THISTLE 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_THISTLE") + "   " + ALL_BACKGROUND_THISTLE_1 + "#1#" + RESET + ALL_BACKGROUND_THISTLE_2 + "#2#" + RESET);
        // ALL_BACKGROUND_KHAKI 1 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_KHAKI") + "   " + ALL_BACKGROUND_KHAKI_1 + "#1#" + RESET + ALL_BACKGROUND_KHAKI_2 + "#2#" + RESET);
        // ALL_BACKGROUND_LIGHT_YELLOW 3
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_YELLOW") + "   " + ALL_BACKGROUND_LIGHT_YELLOW_3 + "#3#" + RESET);
        // ALL_BACKGROUND_HONEYDEW 2
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_HONEYDEW") + "   " + ALL_BACKGROUND_HONEYDEW_2 + "#2#" + RESET);
        // ALL_BACKGROUND_ORANGE_RED 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_ORANGE_RED") + "   " + ALL_BACKGROUND_ORANGE_RED_1 + "#1#" + RESET);
        // ALL_BACKGROUND_SALMON 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_SALMON") + "   " + ALL_BACKGROUND_SALMON_1 + "#1#" + RESET);
        // ALL_BACKGROUND_LIGHT_CORAL
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_LIGHT_CORAL") + "   " + ALL_BACKGROUND_LIGHT_CORAL + "###" + RESET);
        // ALL_BACKGROUND_PALE_VIOLET_RED 1
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_PALE_VIOLET_RED") + "   " + ALL_BACKGROUND_PALE_VIOLET_RED_1 + "#1#" + RESET);
        //  ALL_BACKGROUND_SANDY_BROWN
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_SANDY_BROWN") + "   " + ALL_BACKGROUND_SANDY_BROWN + "###" + RESET);
        //  ALL_BACKGROUND_CORNSILK
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "ALL_BACKGROUND_CORNSILK") + "   " + ALL_BACKGROUND_CORNSILK_1 + "#1#" + RESET);
    }

    /**
     * Prints a "display" where all color options are used.
     * <br>
     * There you can see the color with the corresponding name, and you can see what options your terminal supports.
     * <br>
     * To show style options, use <italic>com.dmeurer.util.console.Format</italic>.
     *
     * @author Dominik Meurer
     */
    public static void printAllColors() {

        System.out.println("--->   Regular AnsiColors");
        printRegularColors();

        System.out.println("--->   Foreground / Font Color");
        printSystemFont();
        printGreyFontCompact();
        printALLFont();

        System.out.println("--->   Background Color");
        printSystemBackground();
        printGreyBackgroundCompact();
        printALLBackground();
    }

    /**
     * Lets you use your own custom RGB font color in the terminal.
     * @param r Red value
     * @param g Green value
     * @param b Blue value
     * @return an ANSI statement that applies the RGB color to the text following this statement.
     *
     * @author Dominik Meurer
     */
    public static String fontRGB(int r, int g, int b) {
        if (!(0 <= r && r <= 255 && 0 <= g && g <= 255 && 0 <= b && b <= 255)) {
            throw new IllegalArgumentException("RGB values must be between 0 and 255");
        }
        return ESC + "[38;2;" + r + ";" + g + ";" + b + "m";
    }

    /**
     * Lets you use your own custom RGB background color in the terminal.
     * @param r Red value
     * @param g Green value
     * @param b Blue value
     * @return an ANSI statement that applies the RGB color to the text following this statement.
     *
     * @author Dominik Meurer
     */
    public static String backgroundRGB(int r, int g, int b) {
        if (!(0 <= r && r <= 255 && 0 <= g && g <= 255 && 0 <= b && b <= 255)) {
            throw new IllegalArgumentException("RGB values must be between 0 and 255");
        }
        return ESC + "[48;2;" + r + ";" + g + ";" + b + "m";
    }
}
