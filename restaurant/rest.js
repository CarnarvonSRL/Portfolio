
function addListeners() {
    document.querySelector('.hamburger').addEventListener('click', toggleMenu);

}

function toggleMenu() {
    // get menu element
    let menu = document.querySelector('.menu');
    // if menu is visibile hide it, else show it
    if(menu.classList.contains('visibile')) {
        menu.classList.remove('.visibile')
    } else {
        menu.classList.add('visibile')
    }
}

window.addEventListener('load', addListeners);

