import React from 'react'

export default class M extends React.Component {

    render() {
        return (
            <div className="row">
                <div className="col-sm-3"></div>
                <div className="col-sm-6">
                    <div>
                        <table className="table ">
                            <thead>
                                <tr>
                                    <th data-field="state" data-radio="true"></th>
                                    <th data-field="number">№</th>
                                    <th data-field="description">Description</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><input type="radio" name="radioGroup" /></td>
                                    <td>1</td>
                                    <td>fgyjgqwwedesdfasdfdg</td>
                                </tr>
                                <tr>
                                     <td><input type="radio" name="radioGroup" /></td>
                                     <td>2</td>
                                     <td>fgyjg wsefgdgdf wefsdfefwefg</td>
                                </tr>
                                <tr>
                                     <td><input type="radio" name="radioGroup" /></td>
                                     <td>3</td>
                                     <td>fgyjg sdfgdfghertgwsdfdfgergdfgdrfgdfgdfg</td>
                                </tr>
                                <tr>
                                     <td><input type="radio" name="radioGroup" /></td>
                                     <td>4</td>
                                     <td>fgyjg ergfdrthwefdxgsg.knalnrg;lirtn</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div className="col-sm-3"></div>
            </div>
        )
    };
}