// interval is in milliseconds. 1000 = 1 second -> so 1000 * 10 = 10 seconds
$('.carousel').carousel({
    interval: 3000,         // интервал
    keyboard: true,         // переключение кнопками,               default: true
    wrap: true             // после прохождения цикла - стоп,      default: true
});