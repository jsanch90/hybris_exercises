var ACC = ACC || {}


ACC.myCreationDate = {

    _autoload: [
        "submitCreationDate"
    ],

    submitCreationDate: function () {
        $('.my_creation_date_form_submit').click(function () {
            if ($("#myCreationDateFormInput").val() == "") {
                alert("Invalid date");
            } else {
                console.log($("#myCreationDateFormInput").val());
                console.log($("#productCode").val());
                $('#my-creation-date-form').ajaxSubmit({
                    success: function () {
                        alert("MyCreationDate attribute updated!");
                        let newDate = new Date($("#myCreationDateFormInput").val());
                        newDate.setHours(newDate.getHours()+24);
                        $(".creation-date").text(newDate.toDateString());
                    }
                })

            }
        })
    }
}