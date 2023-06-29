// 재직 중 체크박스
function onCheck(e){
    if (e.checked == true) {
        document.getElementById("workCompanyInputEndDate").value = null;
        document.getElementById("workCompanyInputEndDate").disabled = true;

        e.value = true;
    } else {
        document.getElementById("workCompanyInputEndDate").disabled = false;

        e.value = false;
    }
}

// 업로드한 사진 표시
function setThumbnail(event) {
    // 업로드한 사진 표시 모두 지우기
    document.querySelector("div#image_container").innerHTML = ''

    var reader = new FileReader();
    reader.onload = function(event) {
      var img = document.createElement("img");
      img.setAttribute("src", event.target.result);
      img.style.cssText  = 'max-width: 6vw; max-height: 10vh; margin-right: 1vw';
      document.querySelector("div#image_container").appendChild(img);
    };
    reader.readAsDataURL(event.target.files[0]);
}

// 등록 기능
const createButton = document.getElementById("workCompanyCreateBtn");

if(createButton) {
    createButton.addEventListener("click", (event) => {
        fetch("/api/work-companies", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                name: document.getElementById("workCompanyInputName").value,
                role: document.getElementById("workCompanyInputRole").value,
                startDate: document.getElementById("workCompanyInputStartDate").value,
                endDate: document.getElementById("workCompanyInputEndDate").value,
                isPresent: document.getElementById("isPresentCheck").value,
                imagePath: document.getElementById("workCompanyImage").value,
            }),
        }).then(function(response) {
            if (!response.ok) {
                throw Error(response.statusText);
            }
            return response;
        }).then(function(response) {
            console.log("ok");
            alert("회사가 추가되었습니다.");
            document.getElementById("workCompanyCloseBtn")[0].click();
            location.replace("/resume#work");
        }).catch(function(error) {
            console.log(error);
        });
    })
}
