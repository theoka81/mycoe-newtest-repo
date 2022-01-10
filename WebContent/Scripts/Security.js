

function callback(googleAction) {
    grecaptcha.ready(function () {
        grecaptcha.execute('6Lc2gGQaAAAAAKMYZOntcCkuxIX-KPWTs0rABvKT', { action: `${googleAction}`}).then(function (token) {
            $('#g-recaptcha-response').val(token);
        });
    });
}

