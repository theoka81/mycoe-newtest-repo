var repositionAndSize = function () {
    var timeLineItems = $('ul.timeline > li.timeline-item');
    var timeLineItemsCount = timeLineItems.length;
    var timelineLineElement = timeLineItems.parent().siblings('.timeline-line').first();

    var timeLineLineLength = 0;
    if (timeLineItemsCount > 1) {
        // distance between first and last item
        timeLineLineLength = timeLineItems.last().offset().left - timeLineItems.first().offset().left;

        timelineLineElement.width(timeLineLineLength);
    }

    var sw = 0;

    if (timelineLineElement.parent && typeof timelineLineElement.parent.get === 'function')
        sw = timelineLineElement.parent().get(0).scrollWidth;

    var hasScroll = sw > timelineLineElement.parent().innerWidth();

    if (!hasScroll) { // scrollbar causing issues. its 5px high
        timeLineItems.css({ 'bottom': '-45px' });
    } else {
        timeLineItems.css({ 'bottom': '-40px' });
    }

    var timelineHeaders = $('.timeline-header');
    timelineHeaders.each(function () {
        var badge = $(this).siblings('.timeline-badge').first();
        var badgeHorizontalCenter = badge.position().left - (badge.width() / 2);

        var headerLeft = badgeHorizontalCenter - ($(this).outerWidth() / 2) - 2;

        $(this).css('left', headerLeft);
    });

}

bindTimeLineEvents = function () {
    $(".timeline-badge").hover(function () {
        var offSet = $(this).offset();
        var timeLinePanel = $(this).siblings('.timeline-panel').first();
        var bodyContainer = $('.container.body-content');
        var contentWidth = bodyContainer.innerWidth();
        timeLinePanel.css({
            "z-index": "9999",
            "height": "auto",
            "width": contentWidth,
            "max-width": 700
        });

        $('body').append(timeLinePanel);

        var viewPosition = this.getBoundingClientRect();

        var vMiddle = $(window).height() / 2;
        var hMiddle = $(window).width() / 2;

        var vertical = (viewPosition.top > vMiddle) ? 'bottom' : 'top';

        var timeLineHeight = timeLinePanel.outerHeight();

        timeLinePanel.css({
            "position": "absolute",
            "top": vertical === 'bottom'
                ? offSet.top - timeLineHeight - 25
                : offSet.top + 25 + $(this).height(),
            "left": hMiddle - (timeLinePanel.width() / 2)
        });

        if (vertical === 'top') {
            timeLinePanel.addClass('arrow-top');
        }


        //var thisObj = $(this);
        //var hMiddleOfThis = offSet.left + (thisObj.outerWidth() / 2);
        //var arrowLeft = hMiddleOfThis - bodyContainer.offset().left - (16 / 2) - (thisObj.innerWidth() / 2) + 2; // its 16px wide in the css with a border of 2

        //$('head').append('<style id="pseudoArrowStyle">.timeline-panel:before { left:' + arrowLeft + 'px !important}</style>');

    },
        function () {
            var timeLinePanel = $('body > .timeline-panel');
            $(this).parent().append(timeLinePanel);

            if (timeLinePanel.hasClass('arrow-top')) {
                timeLinePanel.removeClass('arrow-top');
            }

            if (timeLinePanel.hasClass('arrow-right')) {
                timeLinePanel.removeClass('arrow-right');
            }

            //$('#pseudoArrowStyle').remove();
        }
    );
}

initTimeLine = function () {
    bindTimeLineEvents();
    repositionAndSize();
    $(window).resize(repositionAndSize);
}