<openmrs:require privilege="View Patients" otherwise="/login.htm" redirect="/index.htm"/>

<div class="info-section">
    <div class="info-header">
        <i class="icon-flag"></i>

        <h3>${ui.message("patientflags.patientOverview.title")}</h3>
    </div>

    <div class="info-body">
        <script>
            jq.get('${ ui.actionLink("processPatientFlags") }', {
                patientId: ${patientId}
            }, function (response) {
                if (!response) {
                    ${ ui.message("coreapps.none ") }
                } else {
                    var stringResponse = JSON.stringify(response).replace("{=", "").replace("}", "");
                    var strRes = stringResponse.replace("{\"\":\"", "").replace("}", "");
                    jq("#flags").html(strRes.replace("\\\", "").replace("\"", ""));
                }
            });
        </script>
        <ul id="flags">
            <i class="icon-spinner"></i>
        </ul>
    </div>
</div>