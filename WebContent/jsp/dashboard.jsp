<style>

    .wrapper-dashboard {
        text-align: center;
    }

    .tabs {
        font-size: 15px;
        padding: 0px;
        list-style: none;
        background: #fff;
        box-shadow: 0px 0px 0px rgba(0,0,0,0);
        display: inline-block;
        border-radius: 50px;
        position: relative;
    }

        .tabs a {
            text-decoration: none;
            text-transform: uppercase;
            padding: 10px 20px;
            display: inline-block;
            position: relative;
            z-index: 1;
            transition-duration: 0.6s;
        }

            .tabs a.active {
                color: #fff;
            }

            .tabs a i {
                margin-right: 5px;
            }

        .tabs .selector {
            height: 100%;
            display: inline-block;
            position: absolute;
            left: 0px;
            top: 0px;
            z-index: 1;
            border-radius: 50px;
            transition-duration: 0.6s;
            transition-timing-function: cubic-bezier(0.68, -0.55, 0.265, 1.55);
            background: #05abe0;
            background: -moz-linear-gradient(45deg, #51c914 0%, #51c914 100%);
            background: -webkit-linear-gradient(45deg, #51c914 0%,#51c914 100%);
            background: linear-gradient(45deg, #51c914 0%,#51c914 100%);
            filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#51c914', endColorstr='#51c914',GradientType=1 );
        }
</style>


<div class="wrapper-dashboard">
    <nav class="tabs">
        <div class="selector"></div>
        <a href="#dashboard" data-toggle="tab" class="active"><i class="fa fa-dashboard"></i>Dashboard</a>
        <a href="#analytics" data-toggle="tab"><i class="fa fa-bar-chart"></i>Analytics</a>
    </nav>
</div>

<div class="tab-content">
    <div id="dashboard" class="tab-pane fade in active">
        <div class="container-fluid">
        </div>
    </div>

    <div id="analytics" class="tab-pane fade in">
        <div class="container-fluid">
            <br />
            <jsp:include page="coreBackOfficeDashBoard.jsp"></jsp:include>
        </div>
    </div>

</div>
<script>
    var tabs = $('.tabs');
    var selector = $('.tabs').find('a').length;
    var activeItem = tabs.find('.active');
    var activeWidth = activeItem.innerWidth();
    $(".selector").css({
        "left": activeItem.position.left + "px",
        "width": activeWidth + "px"
    });

    $(".tabs").on("click", "a", function (e) {
        e.preventDefault();
        $('.tabs a').removeClass("active");
        $(this).addClass('active');
        var activeWidth = $(this).innerWidth();
        var itemPos = $(this).position();
        $(".selector").css({
            "left": itemPos.left + "px",
            "width": activeWidth + "px"
        });
    });
</script>

